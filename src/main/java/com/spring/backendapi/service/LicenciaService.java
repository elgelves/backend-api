package com.spring.backendapi.service;

import com.spring.backendapi.entities.Licencia;

import java.util.List;

public interface LicenciaService {

    List<Licencia> listarTodos();

    Licencia findByLicenciaId(Long licenciaId);
}
