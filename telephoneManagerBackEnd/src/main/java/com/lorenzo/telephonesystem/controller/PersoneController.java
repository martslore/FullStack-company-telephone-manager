package com.lorenzo.telephonesystem.controller;

import com.lorenzo.telephonesystem.model.Persone;
import com.lorenzo.telephonesystem.service.PersoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persone")
@CrossOrigin
public class PersoneController {
    @Autowired
    private PersoneService personeService;

    @PostMapping("/add")
    public String add(@RequestBody Persone persone){
        personeService.savePersona(persone);
        return "New person is added";
    }

    @GetMapping("/getAll")
    public List<Persone> list(){
        return personeService.getAllPersone();
    }
}



