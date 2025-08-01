package com.belos.bibliotecaV2.dto;

import com.belos.bibliotecaV2.enums.Genero;
import com.belos.bibliotecaV2.model.Libro;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LibroDTO {
    private Integer id;

    private String titulo;
    private String isbn;
    private Integer anoPublicacion;

    private Genero genero;

    private AutorDTO autorDTO;

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.titulo = libro.getTitulo();
        this.isbn = libro.getIsbn();
        this.anoPublicacion = libro.getAnoPublicacion();
        this.genero = libro.getGenero();
        this.autorDTO = new AutorDTO(libro.getAutor());
    }    
}
