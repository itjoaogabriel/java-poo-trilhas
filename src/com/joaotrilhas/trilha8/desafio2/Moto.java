package com.joaotrilhas.trilha8.desafio2;

public class Moto extends Veiculo {

    private int cilindrada;
    public int getCilindrada() { return cilindrada; }
    @Override
    public String getTipoVeiculo() { return "Moto"; }

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        if (cilindrada < 0){
            throw new IllegalArgumentException("O número de cilindradas não pode ser negativo.");
        }
        this.cilindrada = cilindrada;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Cilindradas: %dcc%n",
                getCilindrada());
    }
}
