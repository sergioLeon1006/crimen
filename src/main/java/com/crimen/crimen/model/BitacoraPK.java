package com.crimen.crimen.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BitacoraPK implements Serializable {

    private Integer lugar;
    private Integer invitado;

    public Integer getLugar() {
        return lugar;
    }

    public void setLugar(Integer lugar) {
        this.lugar = lugar;
    }

    public Integer getInvitado() {
        return invitado;
    }

    public void setInvitado(Integer invitado) {
        this.invitado = invitado;
    }
}
