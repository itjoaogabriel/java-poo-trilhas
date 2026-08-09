package com.joaotrilhas.trilha8.desafio2;

public class Carro extends Veiculo {

    private int numeroPortas;

    public int getNumeroPortas() { return numeroPortas; }
    @Override
    public String getTipoVeiculo() { return "Carro"; }

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
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
