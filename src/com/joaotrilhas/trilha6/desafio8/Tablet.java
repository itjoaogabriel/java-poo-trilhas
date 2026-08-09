package com.joaotrilhas.trilha6.desafio8;

public class Tablet extends Dispositivo {

    private double tamanhoTela;
    private boolean temTeclado;

    public double getTamanhoTela() { return tamanhoTela; }
    public boolean isTemTeclado() { return temTeclado; }

    public Tablet(String marca, String modelo, double preco, double tamanhoTela, boolean temTeclado) {
        super(marca, modelo, preco);
        if (tamanhoTela < 0) {
            throw new IllegalArgumentException("O tamanho da tela não pode ser negativo.");
        }
        this.tamanhoTela = tamanhoTela;
        this.temTeclado = temTeclado;
    }
    @Override
    public void exibir() {
        System.out.println("Tablet");
        System.out.format("Tamanho da tela: %.2f'' | Tem teclado? %s%n",
                getTamanhoTela(),
                isTemTeclado() ? "Sim" : "Não");
        super.exibir();
    }
}
