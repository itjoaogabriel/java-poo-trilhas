package com.joaotrilhas.trilha2.desafio7;

public class Veiculo {

    String placa;
    String tipoVeiculo;
    int horasEstacionado;

    double calcularTarifa() {
        double valorAPagar = 0.0;

        if (tipoVeiculo.equals("carro")) {
            valorAPagar = 5 * horasEstacionado;
        } else if (tipoVeiculo.equals("moto")) {
            valorAPagar = 3 * horasEstacionado;
        } else if (tipoVeiculo.equals("caminhão")) {
            valorAPagar = 10 * horasEstacionado;
        } else {
            System.out.println("Tipo de veículo informado inválido.");
        }
        return  valorAPagar;
    }

    void exibirTicket() {
        System.out.format("Placa: %s | Veículo: %s | Valor a pagar R$%.2f%n", placa, tipoVeiculo, calcularTarifa());
    }
}
