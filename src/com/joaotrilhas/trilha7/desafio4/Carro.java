package com.joaotrilhas.trilha7.desafio4;

public class Carro extends Veiculo {

    private int numeroPortas;

    public int getNumeroPortas() { return numeroPortas; }

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        if (numeroPortas < 0){
            throw new IllegalArgumentException("O número de portas não pode ser negativo.");
        }
        this.numeroPortas = numeroPortas;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Número de portas: %d%n",
                getNumeroPortas());
    }
}
