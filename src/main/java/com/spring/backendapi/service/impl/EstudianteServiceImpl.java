package com.spring.backendapi.service.impl;


import com.spring.backendapi.entities.Estudiante;
import com.spring.backendapi.repositories.EstudianteRepository;
import com.spring.backendapi.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Estudiante registrar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> listarTodos() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eliminar(Long estudianteId) {
        estudianteRepository.deleteById(estudianteId);
    }

    @Override
    public Estudiante findByEstudianteId(Long estudianteId) {
        return estudianteRepository.findById(estudianteId).get();
    }

}
