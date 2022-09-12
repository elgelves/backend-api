package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data @Entity @Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="estudiante_id")
    private Long estudianteId;

    @Column(name ="estudiante_nombre")
    @NotNull(message = "es obligatorio")
    @NotEmpty(message = "no puede estar vacio")
    private String estudianteNombre;

    @Column(name ="estudiante_edad")
    @NotNull(message = "es obligatorio")
    @NotEmpty(message = "no puede estar vacio")
    private String estudianteEdad;

    @Column(name ="estudiante_documento")
    @NotNull(message = "es obligatorio")
    @NotEmpty(message = "no puede estar vacio")
    private String estudianteDocumento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "licencia_id")
    private Licencia licencia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "curso_id")
    private Curso curso;

}
