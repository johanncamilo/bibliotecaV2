package com.belos.bibliotecaV2.dto;

import java.time.LocalDate;

import com.belos.bibliotecaV2.model.Autor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorDTO {

    private Integer id;
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombre = autor.getNombre();
        this.nacionalidad = autor.getNacionalidad();
        this.fechaNacimiento = autor.getFechaNacimiento();
    }
}
