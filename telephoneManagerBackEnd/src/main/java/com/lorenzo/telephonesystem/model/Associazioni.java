package com.lorenzo.telephonesystem.model;


import javax.persistence.*;


@Entity
@IdClass(AssociazioniId.class)
public class Associazioni {
    @Id
    @Column(name ="id_Persona")
    private int idPersona;

    @Id
    @Column(name ="id_Dispositivo")
    private int idDispositivo;
    public Associazioni() {
    }

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
}
