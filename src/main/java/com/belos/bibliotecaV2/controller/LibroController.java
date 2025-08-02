package com.belos.bibliotecaV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belos.bibliotecaV2.model.Libro;
import com.belos.bibliotecaV2.service.LibroServiceImpl;

@RestController
@RequestMapping("api/libros")
public class LibroController {

    @Autowired
    private LibroServiceImpl libroService;

    @GetMapping
    public ResponseEntity<List<Libro>> getAll() {
        return ResponseEntity.ok(libroService.getAll());
    }    
    
}
