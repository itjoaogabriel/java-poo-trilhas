package com.joao.cursojava.aula27.exercicios;

public class testeLampada {

    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.ligar();

        if(lampada.ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }

        lampada.desligar();

        if(lampada.ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
}
