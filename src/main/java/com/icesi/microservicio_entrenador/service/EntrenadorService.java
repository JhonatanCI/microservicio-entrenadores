package com.icesi.microservicio_entrenador.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icesi.microservicio_entrenador.model.Entrenador;
import com.icesi.microservicio_entrenador.repository.EntrenadorRepository;

import java.util.List;

@Service
public class EntrenadorService {
    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<Entrenador> obtenerTodosEntrenadores() {
        return entrenadorRepository.findAll();
    }

    public Entrenador agregarEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }
}
