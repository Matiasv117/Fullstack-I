package com.example.Api_videojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Protocolo HTTP
@RestController
//URL: permite llegar a la dirección
//GET: llamar datos, acceder al stock.
//PUT: agregar una nueva fruta
//DELETE: Borrar una fruta
//PATCH: Actualizar una fruta

// 2 anotaciones para definir una ruta base para nuestra API
@RequestMapping ("/api/v1/videojuegos")
//Metodo publico
public class VideojuegoController {
    //3 -E
    @GetMapping("/hola")
    public String saludo(){
        //4 Agregar un retorno
        return "Bienvenidos a mi API de Videojuegos";
    }

    //5 Este metodo responde con un JSON
    @GetMapping("/top")
    public Videojuego obtenerVideojuego(){
        //Creamos un nuevo juego y lo retomamos en JSON
        return new Videojuego("Halo CE",10, "Xbox,PC");
    }

    //6 CLase interna para representar el videojuego
    static class Videojuego{
        private String titulo;
        private String descripcion;
        private int puntuacion;

        public String getTitulo() {
            return titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public Videojuego(String titulo, int puntuacion, String descripcion) {
            this.titulo = titulo;
            this.puntuacion = puntuacion;
            this.descripcion = descripcion;

        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Videojuego{" +
                    "titulo='" + titulo + '\'' +
                    ", descripcion='" + descripcion + '\'' +
                    ", puntuacion=" + puntuacion +
                    '}';
        }
    }
}
