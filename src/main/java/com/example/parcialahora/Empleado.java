package com.example.parcialahora;

public class Empleado extends Persona implements FormaCalcularSalario{
    public Empleado(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo) {
        super(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo);
    }

    @Override
    public double calcularSalario() {
        return (this.getNumeroSalarioMinimo() * this.getSMMLV())*0.88;
    }
}
