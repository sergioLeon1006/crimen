package com.crimen.crimen.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lugar")
public class Lugar {

    @Id
    private Integer id;
    private String nombre;

    @OneToMany(mappedBy = "lugarfk")
    private List<Artefactos> artefactos;

    public List<Artefactos> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefactos> artefactos) {
        this.artefactos = artefactos;
    }

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
}
