package com.spring.backendapi.service;

import com.spring.backendapi.entities.Nivel;

import java.util.List;

public interface NivelService {

    List<Nivel> listarTodos();

    Nivel findByNivelId(Long nivelId);
}
