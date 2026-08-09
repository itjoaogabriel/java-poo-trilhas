package com.joaotrilhas.trilha6.desafio7;

public class Cachorro extends Animal {

    private String raca;
    private boolean adestrado;

    public String getRaca() { return raca; }
    public boolean isAdestrado() { return adestrado; }

    public Cachorro(String nome, String especie,double peso, String raca, boolean adestrado) {
        super(nome, especie, peso);
        if (raca == null || raca.isEmpty()) {
            throw new IllegalArgumentException("Informe uma raça.");
        }
        this.raca = raca;
        this.adestrado = adestrado;
    }
    public void buscar() {
        System.out.format("%s está buscando o osso.", getNome());
    }

    @Override
    public String emitirSom() {
        return "au au";
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Raça: %s | É adestrado? %s%n",
                getRaca(),
                isAdestrado() ? "Sim" : "Não");
    }
}
