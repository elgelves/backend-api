package com.spring.backendapi.service;

import com.spring.backendapi.entities.Estudiante;

import java.util.List;


public interface EstudianteService {

   Estudiante registrar(Estudiante estudiante);

   List<Estudiante> listarTodos();

   Estudiante actualizar(Estudiante estudiante);

   void eliminar(Long estudianteId);
   Estudiante findByEstudianteId(Long estudianteId);


}
