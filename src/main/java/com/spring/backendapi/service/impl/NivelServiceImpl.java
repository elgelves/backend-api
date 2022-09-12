package com.spring.backendapi.service.impl;

import com.spring.backendapi.entities.Nivel;
import com.spring.backendapi.repositories.NivelRepository;
import com.spring.backendapi.service.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelServiceImpl implements NivelService {

    @Autowired
    private NivelRepository nivelRepository;

    @Override
    public List<Nivel> listarTodos() {
        return nivelRepository.findAll();
    }

    @Override
    public Nivel findByNivelId(Long nivelId) {
        return nivelRepository.findById(nivelId).get();
    }
}
