package com.belos.bibliotecaV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belos.bibliotecaV2.model.Autor;
import com.belos.bibliotecaV2.service.AutorServiceImpl;

@RestController
@RequestMapping("api/autores")
public class AutorController {

    @Autowired
    private AutorServiceImpl autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll() {
        return ResponseEntity.ok(autorService.getAll());
    }

    
    
}
