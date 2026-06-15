package com.joaotrilhas.trilha4.desafio5;

public class VeiculoTeste {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        veiculo.setAno(2025);
        veiculo.setMarca("BMW");
        veiculo.setModelo("X5");
        veiculo.setPreco(500000.0);
        veiculo.setQuilometragem(0);
        veiculo.setQuilometragem(-10);
        veiculo.setQuilometragem(100);
        veiculo.setQuilometragem(0);
        veiculo.exibirFicha();
    }
}