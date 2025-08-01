package com.belos.bibliotecaV2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belos.bibliotecaV2.model.Libro;

@Repository
public interface LibroRepo extends JpaRepository<Libro, Integer>{
    
}
