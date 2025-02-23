package com.icesi.microservicio_entrenador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icesi.microservicio_entrenador.model.Entrenador;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
}
