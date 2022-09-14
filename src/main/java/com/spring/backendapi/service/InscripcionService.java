package com.spring.backendapi.service;

import com.spring.backendapi.entities.Inscripcion;

import java.util.List;

public interface InscripcionService {

    Inscripcion registrarInscripcion(Inscripcion inscripcion);

    List<Inscripcion> listarTodos();

    Inscripcion actualizarInscripcion(Inscripcion inscripcion);

    void eliminarInscripcion(Long inscripcionId);
    Inscripcion findByInscripcionId(Long inscripcionId);
}
