package com.icesi.microservicio_entrenador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.icesi.microservicio_entrenador.model.Entrenador;
import com.icesi.microservicio_entrenador.service.EntrenadorService;

import java.util.List;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping
    public Entrenador agregarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.agregarEntrenador(entrenador);
    }

    @GetMapping
    public List<Entrenador> obtenerTodosEntrenadores() {
        return entrenadorService.obtenerTodosEntrenadores();
    }

    @GetMapping("/{id}")
    public Entrenador obtenerEntrenadorPorId(@PathVariable Long id) {
        return entrenadorService.obtenerEntrenadorPorId(id);
    }


}
