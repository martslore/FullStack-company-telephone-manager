package com.lorenzo.telephonesystem.service;
import com.lorenzo.telephonesystem.model.Dispositivi;
import java.util.List;


public interface DispositiviService {
    public Dispositivi saveDispositivo(Dispositivi dispositivi);
    public List<Dispositivi> getAllDispositivi();
}
