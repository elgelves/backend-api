package com.spring.backendapi.controller;

import com.spring.backendapi.entities.Curso;
import com.spring.backendapi.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> obtenerCursos(){
        return cursoService.listarTodos();
    }

    @GetMapping("/{cursoId}")
    public ResponseEntity<Curso> obtenerCurso(@PathVariable Long cursoId) {
        return new ResponseEntity<>(cursoService.findByCursoId(cursoId), HttpStatus.OK);
    }
}
