package com.adr.polimorfismo.controllers;

import com.adr.polimorfismo.App;
import com.adr.polimorfismo.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AñadirController {

    @FXML
    private Button saveButton;

    @FXML
    private TextField textFieldMatricula;

    @FXML
    private TextField textFieldNombre;

    @FXML
    void onMouseClickedGuardar(MouseEvent event) {
        if (textFieldMatricula.getText().trim().isEmpty() ||textFieldNombre.getText().trim().isEmpty()) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Los campos están vacíos");
            alert.showAndWait();
        }else {
            try {
                int matricula = Integer.parseInt(textFieldMatricula.getText());
                String nombre = textFieldNombre.getText();
                Student student = new Student(matricula, nombre);
                if (App.getBases().addStudent(student)) {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Notificación");
                    alert.setContentText("Datos agregados correctamente.");
                    alert.showAndWait();
                }else {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Ha habido un error al añadir, intente de nuevo, por favor");
                    alert.showAndWait();
                }
            }catch (Exception e){
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Formato incorrecto, solo puede ingresar números en la matrícula: "+e.getMessage());
                alert.showAndWait();
            }
        }
    }

}