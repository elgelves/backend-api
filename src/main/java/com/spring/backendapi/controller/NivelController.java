package com.spring.backendapi.controller;

import com.spring.backendapi.entities.Licencia;
import com.spring.backendapi.entities.Nivel;
import com.spring.backendapi.service.LicenciaService;
import com.spring.backendapi.service.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = ("*"))
@RequestMapping("api/niveles")
public class NivelController {

    @Autowired
    private NivelService nivelService;

    @GetMapping
    public List<Nivel> obtenerNiveles(){
        return nivelService.listarTodos();
    }

    @GetMapping("/{nivelId}")
    public ResponseEntity<Nivel> obtenerNivel(@PathVariable Long nivelId) {
        return new ResponseEntity<>(nivelService.findByNivelId(nivelId), HttpStatus.OK);
    }
}
