package com.joaotrilhas.trilha6.desafio7;

public class Peixe extends Animal {

    private double profundidadeMaxima;
    private boolean aguaSalgada;

    public double getProfundidadeMaxima() { return profundidadeMaxima; }
    public boolean isAguaSalgada() { return aguaSalgada; }

    public Peixe(String nome, String especie,double peso, double profundidadeMaxima, boolean aguaSalgada) {
        super(nome, especie, peso);
        if (profundidadeMaxima < 0) {
            throw new IllegalArgumentException("Profundidade máxima não pode ser negativa.");
        }
        this.profundidadeMaxima = profundidadeMaxima;
        this.aguaSalgada = aguaSalgada;
    }

    public void nadar() {
        if (aguaSalgada) {
            System.out.format("%s está nadando.", getNome());
        } else {
            System.out.format("%s não consegue nadar.", getNome());
        }
    }

    @Override
    public String emitirSom() {
        return "plu plu";
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Profundidade máxima de mergulho: %.2fm | De água salgada? %s%n",
                getProfundidadeMaxima(),
                isAguaSalgada() ? "Sim" : "Não");
    }
}
