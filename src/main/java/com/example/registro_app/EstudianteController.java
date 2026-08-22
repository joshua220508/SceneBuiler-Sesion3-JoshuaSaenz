package com.example.registro_app;
import com.example.registro_app.modelos.Estudiante;

import com.example.registro_app.dao.EstudianteDAO;
import com.example.registro_app.modelos.Estudiante;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EstudianteController {
    EstudianteDAO registros = new EstudianteDAO();
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtNota;
    @FXML
    private Label lblpromedio;

    @FXML
    protected void OnGuardarClik(){
        leerDatos();
        LimpiarTextFields();
    }

    private void leerDatos(){
        String nombre = txtNombre.getText();
        int nota = Integer.parseInt(txtNota.getText());
        guardarDatos(nombre, nota);
    }

    private void guardarDatos(String nombre, int nota){


    }

    private void MostrarPromedio(){
        lblpromedio.setText("Promedio:" + registros.getPromedio());
    }

    private void LimpiarTextFields(){
        txtNombre.setText("");
        txtNota.setText("");
        MostrarPromedio();
    }


}
