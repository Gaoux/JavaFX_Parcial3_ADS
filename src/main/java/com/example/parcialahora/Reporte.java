package com.example.parcialahora;

public class Reporte {
    private String nombre;
    private int ID;
    private double salario;

    public Reporte(String nombre, int ID, double salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
    }
    public Reporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
