package com.crimen.crimen.model;

import javax.persistence.*;

@Entity
@Table(name = "bitacora")
public class Bitacora {

    @EmbeddedId
    private BitacoraPK id; // el id viene de otra clase
    private Integer hora;

  /* @ManyToOne
    @JoinColumn(name="invitado" ,insertable = false,updatable = false)
    private Invitado invitado;

    @ManyToOne
    @JoinColumn(name="lugar",insertable = false,updatable = false)
    private Lugar lugar ;*/

    //getter and setters

    public BitacoraPK getId() {
        return id;
    }

    public void setId(BitacoraPK id) {
        this.id = id;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

   /*public Invitado getInvitado() {
        return invitado;
    }

    public void setInvitado(Invitado invitado) {
        this.invitado = invitado;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }*/
}
