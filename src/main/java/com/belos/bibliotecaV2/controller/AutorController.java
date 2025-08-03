package com.belos.bibliotecaV2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getById(@PathVariable Integer id) {
        Optional<Autor> autor = autorService.getById(id);

        return autor.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor) {
        Autor insertado = autorService.create(autor);

        return new ResponseEntity<>(insertado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> updAutor(@PathVariable Integer id, @RequestBody Autor autor) {
        Optional<Autor> autorExiste = autorService.getById(id);

        /**
         * !bug_here
         * está creando actualizando el registro y crea un nuevo registro duplicado con nulos en los campos no definidos
         */
        if(autorExiste.isEmpty()) { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }

        Autor updated = autorExiste.get();
        updated.setNombre(autor.getNombre());
        updated.setNacionalidad(autor.getNacionalidad());
        updated.setFechaNacimiento(autor.getFechaNacimiento());
        return new ResponseEntity<>(autorService.create(updated), HttpStatus.OK);

    }

    
}
