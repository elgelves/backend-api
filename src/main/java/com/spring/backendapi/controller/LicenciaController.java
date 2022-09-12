package com.spring.backendapi.controller;

import com.spring.backendapi.entities.Licencia;
import com.spring.backendapi.service.LicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/licencias")
public class LicenciaController {

    @Autowired
    private LicenciaService licenciaService;

    @GetMapping
    public List<Licencia> obtenerLicencias(){
        return licenciaService.listarTodos();
    }

    @GetMapping("/{licenciaId}")
    public ResponseEntity<Licencia> obtenerLicencia(@PathVariable Long licenciaId) {
        return new ResponseEntity<>(licenciaService.findByLicenciaId(licenciaId), HttpStatus.OK);
    }
}
