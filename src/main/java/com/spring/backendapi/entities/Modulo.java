package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;


@Data @Entity @Table(name="modulo")
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modulo_id")
    private Long moduloId;

    @Column(name = "modulo_nombre")
    private String moduloNombre;



}
