package com.spring.backendapi.entities;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name="nivel")
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nivel_id")
    private Long nivelId;

    @Column(name = "nivel_nombre")
    private String nivelNombre;
}
