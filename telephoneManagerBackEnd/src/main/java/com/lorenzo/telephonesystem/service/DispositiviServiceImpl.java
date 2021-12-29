package com.lorenzo.telephonesystem.service;

import com.lorenzo.telephonesystem.model.Dispositivi;
import com.lorenzo.telephonesystem.repository.DispositiviRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositiviServiceImpl implements DispositiviService{
    @Autowired
    private DispositiviRepository dispositiviRepository;

    @Override
    public Dispositivi saveDispositivo(Dispositivi dispositivi) {
        return dispositiviRepository.save(dispositivi);
    }

    @Override
    public List<Dispositivi> getAllDispositivi() {
        return dispositiviRepository.findAll();
    }
}
