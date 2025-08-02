package com.belos.bibliotecaV2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belos.bibliotecaV2.model.Libro;
import com.belos.bibliotecaV2.repo.LibroRepo;
import com.belos.bibliotecaV2.service.interfaces.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepo libroRepo;

    @Override
    public List<Libro> getAll() {
        return libroRepo.findAll();
    }

    @Override
    public Optional<Libro> getById(Integer id) {
        return libroRepo.findById(id);
    }

    @Override
    public Libro create(Libro libro) {
        return libroRepo.save(libro);
    }

    @Override
    public void eliminar(Integer id) {
        libroRepo.deleteById(id);
    }
    
}
