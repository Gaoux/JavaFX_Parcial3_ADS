package com.example.parcialahora;

public class Asignatura {
    private int numHoras;
    private String nombre;
    public Asignatura(int numHoras, String nombre) {
        this.numHoras = numHoras;
        this.nombre = nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
