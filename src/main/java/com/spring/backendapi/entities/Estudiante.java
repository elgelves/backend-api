package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data @Entity @Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="estudiante_id", unique = true)
    private Long estudianteId;

    @Column(name ="estudiante_documento", unique = true)
    private String estudianteDocumento;

    @Column(name ="estudiante_nombre")
    @NotBlank
    @NotNull
    private String estudianteNombre;

    @Column(name ="estudiante_edad")
    @NotBlank
    @Size(max = 2)
    private String estudianteEdad;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "licencia_id")
    private Licencia licencia;


}
