package com.lorenzo.telephonesystem.controller;

import com.lorenzo.telephonesystem.model.Dispositivi;

import com.lorenzo.telephonesystem.service.DispositiviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivi")
@CrossOrigin
public class DispositiviController {
    @Autowired
    private DispositiviService dispositiviService;

    @PostMapping("/add")
    public String add(@RequestBody Dispositivi dispositivo){
        dispositiviService.saveDispositivo(dispositivo);
        return "New device is added";
    }

    @GetMapping("/getAll")
    public List<Dispositivi> list(){
        return dispositiviService.getAllDispositivi();
    }
}
