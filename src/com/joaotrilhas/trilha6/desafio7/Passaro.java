package com.joaotrilhas.trilha6.desafio7;

public class Passaro extends Animal {

    private double envergadura;
    private boolean voa;

    public double getEnvergadura() { return envergadura; }
    public boolean isVoa() { return voa; }

    public Passaro(String nome, String especie,double peso, double envergadura, boolean voa) {
        super(nome, especie, peso);
        if (envergadura < 0) {
            throw new IllegalArgumentException("Envergadura não pode ser negativa.");
        }
        this.envergadura = envergadura;
        this.voa = voa;
    }

    public void voar() {
        if (voa) {
            System.out.format("%s está voando.", getNome());
        } else {
            System.out.format("%s não consegue voar.", getNome());
        }
    }
    @Override
    public String emitirSom() {
        return "piu piu";
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Envergadura: %.2fcm | Voa: %s%n",
                getEnvergadura(),
                isVoa() ? "Sim" : "Não");
    }
}
