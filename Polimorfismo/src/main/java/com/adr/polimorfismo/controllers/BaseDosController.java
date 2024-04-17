package com.adr.polimorfismo.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.adr.polimorfismo.App;
import com.adr.polimorfismo.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class BaseDosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn matriculaColumn;

    @FXML
    private TableColumn nombreColumn;

    @FXML
    private TableView<Student> studentsTable;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }
    private ObservableList<Student> students;
    @FXML
    void initialize() {
        students = FXCollections.observableArrayList();
        ArrayList<Student> estudiantes;
        estudiantes = App.getBases().getStudentBase2();
        this.matriculaColumn.setCellValueFactory(new PropertyValueFactory("matricula"));
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        for (int i = 0; i < estudiantes.size(); i++) {
            students.add(estudiantes.get(i));
        }
        studentsTable.setItems(students);
    }

}

