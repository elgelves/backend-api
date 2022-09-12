package com.spring.backendapi.service;

import com.spring.backendapi.entities.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> listarTodos();

    Curso findByCursoId(Long cursoId);
}
