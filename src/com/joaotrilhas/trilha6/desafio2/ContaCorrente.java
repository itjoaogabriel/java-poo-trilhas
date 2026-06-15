package com.joaotrilhas.trilha6.desafio2;

public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() { return limite; }

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        if (limite < 0) {
            throw new IllegalArgumentException("Limite não pode ser negativo.");
        }
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
        }
        else if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            throw new IllegalArgumentException("Saque não pode ser efetuado, informe um valor válido.");
        }
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Limite R$%.2f%n", getLimite());
    }
}