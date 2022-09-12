package com.spring.backendapi.service.impl;

import com.spring.backendapi.entities.Curso;
import com.spring.backendapi.repositories.CursoRepository;
import com.spring.backendapi.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findByCursoId(Long cursoId) {
        return cursoRepository.findById(cursoId).get();
    }
}
