package com.example.parcialahora;

import java.util.ArrayList;
import java.util.List;

public class Monitor extends  Persona implements FormaCalcularSalario{
    private double valorHora;
    private List<Asignatura> asignaturaList;
    public Monitor(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo, double valorHora) {
        super(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo);
        this.valorHora = valorHora;
        this.asignaturaList = new ArrayList<>();
    }


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public List<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    public void agregarAsignatura(int numHoras, String nombre){
        asignaturaList.add(new Asignatura(numHoras, nombre));
    }

    @Override
    public double calcularSalario() {
        double valor = 0;
        for(Asignatura i: this.getAsignaturaList())
            valor += i.getNumHoras() *  this.getValorHora();
        return valor;
    }
}
