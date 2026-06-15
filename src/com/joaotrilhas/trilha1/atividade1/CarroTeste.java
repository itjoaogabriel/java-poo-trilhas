package com.joaotrilhas.trilha1.atividade1;

public class CarroTeste {

    public static void main(String[] args) {

        Carro meuCarro = new Carro(); //criando o objeto

        meuCarro.marca = "Toyota"; //atribuindo valor ao atributo
        meuCarro.cor = "Azul";
        meuCarro.velocidade = 0;

        meuCarro.acelerar(); // chamando o método
        meuCarro.acelerar();

        System.out.format("Marca: %s%nCor: %s%n", meuCarro.marca, meuCarro.cor);
    }
}
