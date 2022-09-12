package com.spring.backendapi.service.impl;

import com.spring.backendapi.entities.Modulo;
import com.spring.backendapi.repositories.ModuloRepository;
import com.spring.backendapi.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuloServiceImpl implements ModuloService {

    @Autowired
    private ModuloRepository moduloRepository;

    @Override
    public List <Modulo> listarTodos() {
        return moduloRepository.findAll();
    }

    @Override
    public Modulo findByModuloId(Long moduloId) {
        return moduloRepository.findById(moduloId).get();
    }
}
