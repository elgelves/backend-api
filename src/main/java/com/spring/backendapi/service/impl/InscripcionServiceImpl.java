package com.spring.backendapi.service.impl;


import com.spring.backendapi.entities.Inscripcion;
import com.spring.backendapi.repositories.InscripcionRepository;
import com.spring.backendapi.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionServiceImpl implements InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    @Override
    public Inscripcion registrarInscripcion(Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    @Override
    public List<Inscripcion> listarTodos() {
        return inscripcionRepository.findAll();
    }

    @Override
    public Inscripcion actualizarInscripcion(Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    @Override
    public void eliminarInscripcion(Long inscripcionId) {
        inscripcionRepository.deleteById(inscripcionId);
    }

    @Override
    public Inscripcion findByInscripcionId(Long inscripcionId) {
        return inscripcionRepository.findById(inscripcionId).get();
    }
}
