package com.lorenzo.telephonesystem.service;
import com.lorenzo.telephonesystem.model.Associazioni;
import java.util.List;

public interface AssociazioniService {
    public Associazioni saveAssociazione(Associazioni associazioni);
    public List<Associazioni> getAllAssociazioni();
}