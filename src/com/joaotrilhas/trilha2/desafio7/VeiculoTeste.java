package com.joaotrilhas.trilha2.desafio7;

public class VeiculoTeste {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();

        veiculo1.placa = "AU09";
        veiculo1.tipoVeiculo = "carro";
        veiculo1.horasEstacionado = 3;

        veiculo2.placa = "AU08";
        veiculo2.tipoVeiculo = "moto";
        veiculo2.horasEstacionado = 1;

        veiculo3.placa = "AU10";
        veiculo3.tipoVeiculo = "caminhão";
        veiculo3.horasEstacionado = 5;

        veiculo1.exibirTicket();
        veiculo2.exibirTicket();
        veiculo3.exibirTicket();
    }
}
