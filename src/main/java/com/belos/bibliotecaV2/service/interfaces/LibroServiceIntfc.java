package com.belos.bibliotecaV2.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.belos.bibliotecaV2.model.Libro;

public interface LibroServiceIntfc {
    public List<Libro> getAll();
    public Optional<Libro> getById(Integer id);
    public Libro create(Libro libro);
    public void eliminar(Integer id);
}
