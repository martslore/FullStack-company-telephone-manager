package com.lorenzo.telephonesystem.controller;

import com.lorenzo.telephonesystem.model.Associazioni;
import com.lorenzo.telephonesystem.service.AssociazioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associazioni")
@CrossOrigin
public class AssociazioniController {
    @Autowired
    private AssociazioniService associazioniService;

    @PostMapping("/add")
    public String add(@RequestBody Associazioni associazioni){
        associazioniService.saveAssociazione(associazioni);
        return "New association is added";
    }

    @GetMapping("/getAll")
    public List<Associazioni> list(){
        return associazioniService.getAllAssociazioni();
    }
}