package com.icesi.microservicio_entrenador;


import com.icesi.microservicio_entrenador.model.Entrenador;
import com.icesi.microservicio_entrenador.repository.EntrenadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {


    @Autowired
    private EntrenadorRepository entrenadorRepository;


    @Override
    public void run(String... args) throws Exception {


        // Cargar entrenadores de ejemplo
        Entrenador entrenador1 = new Entrenador();
        entrenador1.setNombre("Carlos Rodríguez");
        entrenador1.setEspecialidad("Yoga");
        entrenadorRepository.save(entrenador1);

        Entrenador entrenador2 = new Entrenador();
        entrenador2.setNombre("Ana Martínez");
        entrenador2.setEspecialidad("Spinning");
        entrenadorRepository.save(entrenador2);

        System.out.println("Datos de ejemplo cargados exitosamente.");
    }
}