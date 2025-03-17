package com.icesi.microservicio_entrenador.controller;

import com.icesi.microservicio_entrenador.model.Entrenador;
import com.icesi.microservicio_entrenador.service.EntrenadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenador")
@Tag(name = "Entrenador", description = "API para la gestión de entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/add")
    @Operation(summary = "Agregar un nuevo entrenador")
    @ApiResponse(responseCode = "201", description = "Entrenador agregado con éxito")
    public Entrenador agregarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.agregarEntrenador(entrenador);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TRAINER')")
    @GetMapping("/get")
    @Operation(summary = "Obtener todos los entrenadores")
    @ApiResponse(responseCode = "200", description = "Lista de entrenadores obtenida con éxito")
    public List<Entrenador> obtenerTodosEntrenadores() {
        return entrenadorService.obtenerTodosEntrenadores();
    }

    @GetMapping("/public")
    @Operation(summary = "Acceder a recurso público")
    public String publico() {
        return "Este es un recurso público";
    }

    @GetMapping("/{id}")
    public Entrenador obtenerEntrenadorPorId(@PathVariable Long id) {
        return entrenadorService.obtenerEntrenadorPorId(id);
    }
}
