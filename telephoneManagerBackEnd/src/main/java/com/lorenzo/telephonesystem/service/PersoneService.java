package com.lorenzo.telephonesystem.service;

import com.lorenzo.telephonesystem.model.Persone;

import java.util.List;

public interface PersoneService {
    public Persone savePersona(Persone persona);
    public List<Persone> getAllPersone();
}

