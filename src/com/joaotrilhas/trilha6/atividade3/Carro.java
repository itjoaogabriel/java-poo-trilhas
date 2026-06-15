package com.joaotrilhas.trilha6.atividade3;

public class Carro extends Veiculo {

    private int numeroPorLugar;
    public int getNumeroPorLugar() { return numeroPorLugar; }

    public Carro(String marca, String modelo, int ano, int lugares) {
        super(marca, modelo, ano);
        this.numeroPorLugar = lugares;
    }

    @Override
    public void exibir() {
        super.exibir();;
        System.out.format("Lugares: %d%n", getNumeroPorLugar());
    }
}
