package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name="licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "licencia_id")
    private Long licenciaId;

    @Column(name = "licencia_nombre")
    private String licenciaNombre;
}
