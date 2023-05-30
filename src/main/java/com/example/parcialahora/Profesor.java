package com.example.parcialahora;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona implements FormaCalcularSalario{
    private double valorHora;
    private Escalafon escalafon;
    private List<Asignatura> asignaturaList;

    public Profesor(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo, double valorHora, Escalafon escalafon) {
        super(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo);
        this.valorHora = valorHora;
        this.escalafon = escalafon;
        this.asignaturaList = new ArrayList<>();
    }


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
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
        return (this.getEscalafon().getSalario() * this.getSMMLV()) * 0.88;
    }
}
