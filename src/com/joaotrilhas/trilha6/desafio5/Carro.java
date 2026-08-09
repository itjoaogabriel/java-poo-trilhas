package com.joaotrilhas.trilha6.desafio5;

public class Carro extends Veiculo {

    private int numeroPorLugar;
    private String tipoCombustivel;

    public int getNumeroPorLugar() { return numeroPorLugar; }
    public String getTipoCombustivel() { return tipoCombustivel; }

    public Carro(String marca, String modelo, int ano, double quilometragem, int numeroPorLugar, String tipoCombustivel) {
        super(marca, modelo, ano, quilometragem);
        if (numeroPorLugar < 0) {
            throw new IllegalArgumentException("Informe o número de lugares.");
        }
        if (tipoCombustivel == null || tipoCombustivel.isEmpty()) {
            throw new IllegalArgumentException("Informe um tipo de combustível.");
        }
        this.numeroPorLugar = numeroPorLugar;
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Nº de lugares: %d | Tipo de combustível: %s%n",
                            getNumeroPorLugar(),
                            getTipoCombustivel());
    }
}