package com.joaotrilhas.trilha4.atividade3;

public class Vaga {

    private String cargo;
    private double salario;
    private boolean aberta;

    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public boolean isAberta() { return aberta; }

    public void setCargo() {
        if (cargo != null && !cargo.isEmpty()) this.cargo = cargo;
    }
    public void setSalario(double salario) {
        if (salario > 0) this.salario = salario;
    }

    public void abrir() {
        aberta = true;
        System.out.format("Vaga %s aberta.%n", cargo);
    }

    public void fechar() {
        aberta = false;
        System.out.format("Vaga %s encerrada.%n", cargo);
    }

    public void exibir() {
        System.out.format("%s | R$ %.2f | %s%n",
                getCargo(), getSalario(), isAberta() ? "Aberta" : "Fechada");
    }
}
