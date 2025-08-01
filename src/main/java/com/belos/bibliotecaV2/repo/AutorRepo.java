package com.belos.bibliotecaV2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belos.bibliotecaV2.model.Autor;

@Repository
public interface AutorRepo extends JpaRepository<Autor, Integer>{
    
}
