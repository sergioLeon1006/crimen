package com.crimen.crimen.service;

import com.crimen.crimen.model.Invitado;
import com.crimen.crimen.repository.InvitadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvitadoServiceImpl implements InvitadoService{

    @Autowired
    private  InvitadoRepository ir ;
    private String nombrePersona;

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public Optional<List<Invitado>> getInvitadoPorNombre() {
        return ir.findByNombre(this.nombrePersona);
    }

    @Override
    public List<Invitado> getAllInvitados() {
        return ir.findAll();
    }

}
