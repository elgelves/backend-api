package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;


@Data @Entity @Table(name="inscripcion")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="inscripcion_id")
    private Long inscripcionId;

    @Column(name ="status_nivel")
    private String statusNivel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}
