package com.joaotrilhas.trilha6.desafio8;

public class Celular extends Dispositivo {

    private String numeroChip;
    private int bateria;

    public String getNumeroChip() { return numeroChip; }
    public int getBateria() { return bateria; }

    public Celular(String marca, String modelo, double preco, String numeroChip, int bateria) {
        super(marca, modelo, preco);
        if (numeroChip == null || numeroChip.isEmpty()) {
            throw new IllegalArgumentException("Informe o número do chip.");
        }
        if (bateria < 0 || bateria > 100) {
            throw new IllegalArgumentException("O valor de bateria não pode ser negativo ou maior do que 100.");
        }
        this.numeroChip = numeroChip;
        this.bateria = bateria;
    }
    @Override
    public void ligar() {
        if (bateria > 20) {
            super.ligar();
        } else {
            System.out.println("Coloque o celular para carregar.");
        }
    }

    public void carregar(int quantidade) {
        bateria = Math.min(bateria + quantidade, 100);
    }
    @Override
    public void exibir() {
        System.out.println("Celular");
        System.out.format("Nº chip: %s | Bateria: %d%%%n",
                            getNumeroChip(),
                            getBateria());
        super.exibir();
    }
}