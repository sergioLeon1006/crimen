package com.crimen.crimen.controller;

import com.crimen.crimen.model.Artefactos;
import com.crimen.crimen.service.ArtefactoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/artefactos")
public class ArtefactoController {

    @Autowired
    ArtefactoServiceImpl as;

    @GetMapping("")
    List<Artefactos>getAll(){
        return as.optenerTodos();
    }

}
