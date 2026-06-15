package com.joaotrilhas.trilha6.atividade3;

public class Moto extends Veiculo {

    private int cilindrada;
    public int getCilindrada() { return cilindrada; }

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Cilindrada: %dcc%n", getCilindrada());
    }
}
