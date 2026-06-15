package com.joaotrilhas.trilha4.desafio9;

public class Cargo {

    private String titulo;
    private double salarioBase;
    private int nivel;

    public String getTitulo() { return titulo; }
    public double getSalarioBase() { return salarioBase; }
    public int getNivel() { return nivel; }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Preencha o campo 'título'.");
        }
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Erro. O salário base do colaborador não pode ser negativo.");
        }
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 5) {
            this.nivel = nivel;
        } else {
            System.out.println("Informe um nível válido.");
        }
    }

    public double getSalarioComBonus() {
        return salarioBase * (1 + nivel * 0.1);
    }
}
