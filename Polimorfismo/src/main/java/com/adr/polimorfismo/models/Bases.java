package com.adr.polimorfismo.models;

import java.util.ArrayList;

public class Bases {
    private IAlumnos estudiantesBase1 = new BaseDatosUno();
    private IAlumnos estudiantesBase2 = new BaseDatosDos();
    private IAlumnos estudiantesBase3 = new BaseDatosTres();

    public boolean addStudent(Student newStudent) {
        boolean bandera;
        if (estudiantesBase1.save(newStudent) && estudiantesBase2.save(newStudent) &&  estudiantesBase3.save(newStudent)){
            System.out.println("Registro exitoso");
            bandera=true;
        }
        else {
            bandera=false;
            System.out.println("Error al registrar el registro");
        }
    return bandera;
    }
    public boolean updataStudent(Student editedStudent){
        boolean bandera=false;
        if (estudiantesBase1.upDate(editedStudent) && estudiantesBase2.upDate(editedStudent)&&estudiantesBase3.upDate(editedStudent)){
            bandera=true;
        }
        return bandera;
    }
    public ArrayList<Student> getStudentBase1(){
        return estudiantesBase1.getStudent();
    }
    public ArrayList<Student> getStudentBase2(){return estudiantesBase2.getStudent();}
    public ArrayList<Student> getStudentBase3(){return estudiantesBase3.getStudent();}
}
