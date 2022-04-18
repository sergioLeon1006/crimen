package com.crimen.crimen.controller;

import com.crimen.crimen.model.Invitado;
import com.crimen.crimen.service.InvitadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invitado")
public class InvitadoController {

    @Autowired
    private InvitadoServiceImpl is;

    @GetMapping("")
    List<Invitado> getAllInvitados(){
        return this.is.getAllInvitados();
    }

    @GetMapping("{nombre}")
    Optional<List<Invitado>> getInvitado(@PathVariable String nombre){
        is.setNombrePersona(nombre);
        return is.getInvitadoPorNombre();
    }
}
