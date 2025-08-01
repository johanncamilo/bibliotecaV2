package com.belos.bibliotecaV2.service.interfaces;

import java.util.List;
import java.util.Optional;

// import com.belos.bibliotecaV2.dto.AutorDTO;
import com.belos.bibliotecaV2.model.Autor;

public interface AutorServiceIntfc {
    public List<Autor> getAll();
    public Optional<Autor> getById(Integer id);
    public Autor create(Autor autor);
    public void eliminar(Integer id);
}
