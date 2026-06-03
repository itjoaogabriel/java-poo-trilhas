package com.joao.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

    public static void  main(String[]args){

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Entre com sua idade");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

        System.out.println("Entre com o valor do item");
        double valor = scan.nextDouble();

        if(valor <= 10){
            System.out.println("Está barato, pode comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto!");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro.");
        }
    }
}
