package com.example.registro_app.dao;

import com.example.registro_app.modelos.Estudiante;

import java.util.List;

public class EstudianteDAO {
    private List<Estudiante> estudiantes;

    public EstudianteDAO() {
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    public double getPromedio(){
        return estudiantes.stream().mapToDouble(Estudiante::getNota).average().orElse(0);
    }
}
