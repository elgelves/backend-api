package com.spring.backendapi.controller;


import com.spring.backendapi.entities.Estudiante;
import com.spring.backendapi.model.Response;
import com.spring.backendapi.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.listarTodos();
    }

    @GetMapping("/{estudianteId}")
    public ResponseEntity<Estudiante> obtenerEstudiante(@PathVariable Long estudianteId) {
        return new ResponseEntity<>(estudianteService.findByEstudianteId(estudianteId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estudiante> registrar(@Valid @RequestBody Estudiante estudiante){
        return new ResponseEntity<Estudiante>(estudianteService.registrar(estudiante), HttpStatus.CREATED);
    }

    @PutMapping("/{estudianteId}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long estudianteId, @RequestBody @Valid Estudiante estudiante) {
        estudiante.setEstudianteId(estudianteId);
        return new ResponseEntity<>(estudianteService.actualizar(estudiante),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{estudianteId}")
    public ResponseEntity<Response> eliminar(@PathVariable Long estudianteId) {
        estudianteService.eliminar(estudianteId);
        return new ResponseEntity<>(new Response("se elimino correctamente"),HttpStatus.OK);
    }

}
