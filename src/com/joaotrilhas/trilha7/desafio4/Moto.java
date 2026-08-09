package com.joaotrilhas.trilha7.desafio4;

public class Moto extends Veiculo {

    private int cilindrada;
    public int getCilindrada() { return cilindrada; }

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
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
