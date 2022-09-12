package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="curso_id")
    private Long cursoId;

    @Column(name ="curso_nombre")
    private String cursoNombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "modulo_id", nullable = false)
    private Modulo modulo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nivel_id")
    private Nivel nivel;

}
