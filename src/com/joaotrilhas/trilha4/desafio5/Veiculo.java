package com.joaotrilhas.trilha4.desafio5;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private double preco;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getQuilometragem() { return quilometragem; }
    public double getPreco() { return preco; }
    public int getIdade() { return 2025 - ano; }
    public boolean isZeroKm() { return quilometragem == 0; }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("O espaço de marca não pode ficar vazio.");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("O espaço de modelo não pode ficar vazio.");
        }
    }

    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro. Informe um ano válido.");
        }
    }

    public void setQuilometragem(double quilometragem) {
        if (quilometragem >= 0 && quilometragem >= this.quilometragem) {
            this.quilometragem = quilometragem;
        } else {
            System.out.println("Quilometragem não pode ser menor que a atual.");
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirFicha() {
        System.out.format("%nMarca: %s | Modelo: %s | Ano: %d | Quilometragem: %.2fKm" +
                        " | Preço R$%.2f", getMarca(), getModelo(), getAno(), getQuilometragem(),
                         getPreco());
    }
}