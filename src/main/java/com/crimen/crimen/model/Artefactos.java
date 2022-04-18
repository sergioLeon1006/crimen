package com.crimen.crimen.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "artefactos")
public class Artefactos {

    @Id
    private Integer id;
    private String nombre;
    private Integer medida;

    @ManyToOne()
    @JoinColumn(name = "lugar")
    private Lugar lugarfk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMedida() {
        return medida;
    }

    public void setMedida(Integer medida) {
        this.medida = medida;
    }

    public Lugar getLugar() {
        return lugarfk;
    }

    public void setLugar(Lugar lugar) {
        this.lugarfk = lugar;
    }
}
