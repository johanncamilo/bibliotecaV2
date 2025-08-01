package com.belos.bibliotecaV2.model;

import java.time.LocalDate;
// import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La anotación @Data de Lombok genera automáticamente métodos útiles para la clase, como: 
 * Getters y setters para todos los campos 
 * toString() 
 * equals() y hashCode()
 * Un constructor para los campos finales
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String nacionalidad;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    // @OneToMany(mappedBy = "autor") // mappedBy indica que la relación se mapea por el campo "autor" en la entidad Libro
    // private List<Libro> libros;
}
