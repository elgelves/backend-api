package com.spring.backendapi.repositories;

import com.spring.backendapi.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
