package com.example.parcialahora;

public enum Escalafon {
    CATEDRA(1),
    INSTRUCTOR(2),
    ASISTENTE(3),
    ASOCIADO(4),
    TITULAR(5);
    private int salario;
    private Escalafon (int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
}
