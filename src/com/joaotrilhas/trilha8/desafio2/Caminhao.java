package com.joaotrilhas.trilha8.desafio2;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public double getCapacidadeCarga() { return capacidadeCarga; }
    @Override
    public String getTipoVeiculo() { return "Caminhao"; }

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga)
    {
        super(marca, modelo, ano);
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("Capacidade de carga não pode ser negativa ou 0.");
        }
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Capacidade de carga: %.2fTon%n",
                getCapacidadeCarga());
    }
}
