package com.crimen.crimen.service;

import com.crimen.crimen.model.Artefactos;
import com.crimen.crimen.repository.ArtefactosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtefactoServiceImpl implements ArtefactoService {

    @Autowired
    ArtefactosRepository ar;

    @Override
    public List<Artefactos> optenerTodos() {
        return ar.findAll();
    }
}
