package com.lorenzo.telephonesystem.service;

import com.lorenzo.telephonesystem.model.Persone;
import com.lorenzo.telephonesystem.repository.PersoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersoneServiceImpl implements PersoneService {

    @Autowired
    private PersoneRepository personeRepository;

    @Override
    public Persone savePersona(Persone persona) {
        return personeRepository.save(persona);
    }

    @Override
    public List<Persone> getAllPersone() {
        return personeRepository.findAll();
    }
}
