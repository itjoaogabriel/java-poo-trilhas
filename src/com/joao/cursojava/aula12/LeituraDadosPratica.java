package com.joao.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosPratica {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Nome: " + nomeCompleto);


        System.out.println("Informe a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Idade: " + idade);
    }
}
