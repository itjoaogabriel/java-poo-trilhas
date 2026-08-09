package com.joaotrilhas.trilha6.desafio5;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;
    private int numeroEixos;

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public int getNumeroEixos() { return numeroEixos; }

    public Caminhao(String marca, String modelo, int ano, double quilometragem, double capacidadeCarga, int numeroEixos)
    {
        super(marca, modelo, ano, quilometragem);
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("Capacidade de carga não pode ser negativa ou 0.");
        }
        if (numeroEixos < 0) {
            throw new IllegalArgumentException("Número de eixos não pode ser negativo.");
        }
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Capacidade de carga: %.2fTon | Nº de eixos: %d%n",
                            getCapacidadeCarga(),
                            getNumeroEixos());
    }
}
