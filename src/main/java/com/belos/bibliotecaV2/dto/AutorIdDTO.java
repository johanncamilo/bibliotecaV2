package com.belos.bibliotecaV2.dto;

import com.belos.bibliotecaV2.model.Autor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorIdDTO {

    private Integer id;

    public AutorIdDTO(Autor autor) {
        this.id = autor.getId();
    }
}
