package com.example.registro_app.modelos;

public class Estudiante {

    private String nombre;
    private int nota;

    public Estudiante(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


}
