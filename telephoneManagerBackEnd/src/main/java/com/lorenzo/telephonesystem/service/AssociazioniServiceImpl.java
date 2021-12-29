package com.lorenzo.telephonesystem.service;

import com.lorenzo.telephonesystem.model.Associazioni;
import com.lorenzo.telephonesystem.repository.AssociazioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociazioniServiceImpl implements AssociazioniService {
    @Autowired
    private AssociazioniRepository associazioniRepository;

    @Override
    public Associazioni saveAssociazione(Associazioni associazioni) { return associazioniRepository.save(associazioni);}

    @Override
    public List<Associazioni> getAllAssociazioni() {return associazioniRepository.findAll();}
}