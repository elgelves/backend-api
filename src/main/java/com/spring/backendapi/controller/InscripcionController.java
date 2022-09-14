package com.spring.backendapi.controller;

import com.spring.backendapi.entities.Inscripcion;
import com.spring.backendapi.model.Response;
import com.spring.backendapi.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping
    public ResponseEntity<Inscripcion> registrarInscripcion(@Valid @RequestBody Inscripcion inscripcion) {
        return new ResponseEntity<Inscripcion>(inscripcionService.registrarInscripcion(inscripcion), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Inscripcion> obtenerInscritos() {
        return inscripcionService.listarTodos();
    }

    @GetMapping("/{inscripcionId}")
    public ResponseEntity<Inscripcion> obtenerInscrito(@PathVariable Long inscripcionId) {
        return new ResponseEntity<>(inscripcionService.findByInscripcionId(inscripcionId), HttpStatus.OK);
    }

    @PutMapping("/{inscripcionId}")
    public ResponseEntity<Inscripcion> actualizarInscripcion(@PathVariable Long inscripcionId, @RequestBody @Valid Inscripcion inscripcion) {
        inscripcion.setInscripcionId(inscripcionId);
        return new ResponseEntity<>(inscripcionService.actualizarInscripcion(inscripcion), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{inscripcionId}")
    public ResponseEntity<Response> eliminarInscripcion(@PathVariable Long inscripcionId) {
        inscripcionService.eliminarInscripcion(inscripcionId);
        return new ResponseEntity<>(new Response("se elimino correctamente"), HttpStatus.OK);
    }


}
