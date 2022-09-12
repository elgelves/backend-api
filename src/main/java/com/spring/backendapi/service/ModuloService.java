package com.spring.backendapi.service;

import com.spring.backendapi.entities.Modulo;

import java.util.List;

public interface ModuloService {

    List<Modulo> listarTodos();

    Modulo findByModuloId(Long moduloId);
}
