package com.spring.backendapi.controller;


import com.spring.backendapi.entities.Modulo;
import com.spring.backendapi.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/modulos")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @GetMapping
    public List<Modulo> obtenerModulos(){
        return moduloService.listarTodos();
    }

    @GetMapping("/{moduloId}")
    public ResponseEntity<Modulo> obtenerModulo(@PathVariable Long moduloId) {
        return new ResponseEntity<>(moduloService.findByModuloId(moduloId), HttpStatus.OK);
    }
}
