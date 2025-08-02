package com.belos.bibliotecaV2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belos.bibliotecaV2.model.Autor;
import com.belos.bibliotecaV2.repo.AutorRepo;
import com.belos.bibliotecaV2.service.interfaces.AutorService;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepo autorRepo;

    @Override
    public List<Autor> getAll() {
        return autorRepo.findAll();
    }

    @Override
    public Optional<Autor> getById(Integer id) {
        return autorRepo.findById(id);
    }

    @Override
    public Autor create(Autor autor) {
        return autorRepo.save(autor);
    }

    @Override
    public void eliminar(Integer id) {
        autorRepo.deleteById(id);
    }
    
}
