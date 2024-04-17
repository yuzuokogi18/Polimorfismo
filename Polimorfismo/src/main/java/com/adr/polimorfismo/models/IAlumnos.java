package com.adr.polimorfismo.models;

import java.util.ArrayList;

public interface IAlumnos {
    boolean save(Student newStudent);
    boolean upDate(Student editedStudent);
    ArrayList<Student> getStudent();
}