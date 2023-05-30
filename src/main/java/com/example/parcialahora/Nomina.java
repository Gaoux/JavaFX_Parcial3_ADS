package com.example.parcialahora;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Persona> personas;

    public Nomina() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo) {
        Persona auxPersona = new Empleado(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo);
        this.personas.add(auxPersona);
    }
    public void agregarPersona(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo, double valorHora) {
        Persona auxPersona = new Monitor(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo, valorHora);
        this.personas.add(auxPersona);
    }
    public void agregarPersona(String nombre, int numeroIdentificacion, int numeroSalarioMinimo, String dependencia, String cargo, double valorHora, Escalafon escalafon) {
        Persona auxPersona = new Profesor(nombre, numeroIdentificacion, numeroSalarioMinimo, dependencia, cargo, valorHora, escalafon);
        this.personas.add(auxPersona);
    }


    public static double calcularSalarioPersona(Persona persona) {
        if (persona instanceof Empleado)
            return ((Empleado)persona).calcularSalario();
         else if (persona instanceof Profesor)
            return ((Profesor) persona).calcularSalario();
         else
             return ((Monitor)persona).calcularSalario();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
