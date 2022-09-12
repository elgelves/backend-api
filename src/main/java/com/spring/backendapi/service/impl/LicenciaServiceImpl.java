package com.spring.backendapi.service.impl;

import com.spring.backendapi.entities.Licencia;
import com.spring.backendapi.repositories.LicenciaRepository;
import com.spring.backendapi.service.LicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenciaServiceImpl implements LicenciaService {

    @Autowired
    private LicenciaRepository licenciaRepository;

    @Override
    public List<Licencia> listarTodos() {
        return licenciaRepository.findAll();
    }

    @Override
    public Licencia findByLicenciaId(Long licenciaId) {
        return licenciaRepository.findById(licenciaId).get();
    }
}
