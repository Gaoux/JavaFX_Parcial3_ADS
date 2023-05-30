package com.example.parcialahora;

public abstract class Persona {
    private String nombre;
    private int numeroIdentificacion;
    private int numeroSalarioMinimo;
    private final int SMMLV = 1160000;
    private String dependencia;
    private String cargo;

    public Persona(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.numeroSalarioMinimo = numeroSalarioMinimo;
        this.dependencia = dependencia;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getNumeroSalarioMinimo() {
        return numeroSalarioMinimo;
    }

    public void setNumeroSalarioMinimo(int numeroSalarioMinimo) {
        this.numeroSalarioMinimo = numeroSalarioMinimo;
    }

    public int getSMMLV() {
        return SMMLV;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
