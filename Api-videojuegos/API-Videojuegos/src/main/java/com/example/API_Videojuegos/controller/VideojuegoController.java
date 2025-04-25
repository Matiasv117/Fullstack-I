package com.example.API_Videojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1

@RestController

//2 Define una ruta para mi api

@RequestMapping("/api/videojuegos")

//3 Metodo publico

public class VideojuegoController {
    //4
    @GetMapping("/hola")
    public String saludar(){
        return "Bienvenido a mi primera API de Videojuegos";
    }

    @GetMapping("/top")
    public Videojuego obtenervideojuegotop(){
        return new Videojuego("The Legend of Zelda: Breath of the Wild", "Nintendo switch", 10);
    }

    static class Videojuego{
        private String titulo;
        private String plataforma;
        private int puntuacion;

        public Videojuego(String titulo, String plataforma, int puntuacion){
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.puntuacion = puntuacion;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public String getTitulo() {
            return titulo;
        }
    }
}
