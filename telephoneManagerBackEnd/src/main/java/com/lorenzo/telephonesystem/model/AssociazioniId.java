package com.lorenzo.telephonesystem.model;

import java.io.Serializable;
import java.util.Objects;

public class AssociazioniId implements Serializable {
    private int idPersona;
    private int idDispositivo;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssociazioniId)) return false;
        AssociazioniId that = (AssociazioniId) o;
        return idPersona == that.idPersona && idDispositivo == that.idDispositivo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, idDispositivo);
    }
}