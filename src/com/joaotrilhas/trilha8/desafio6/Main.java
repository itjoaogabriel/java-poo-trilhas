package com.joaotrilhas.trilha8.desafio6;

public class Main {
    public static void main(String[] args) {

        Usuario[]  usuarios = new Usuario[4];

        usuarios[0] = new UsuarioAdmin("João", "a@gmail.com", "2020");
        usuarios[1] = new UsuarioAdmin("Ana", "b@gmail.com", "2021");
        usuarios[2] = new UsuarioComum("Pedro", "aa@gmail.com", "202020");
        usuarios[3] = new UsuarioComum("Laura", "n@gmail.com", "202021");

        for ( int i = 0; i < 3; i++ ) {
            if (usuarios[2] instanceof UsuarioComum pedro) {
                if (pedro.autenticar("2020")) {
                    System.out.println("Login realizado.");
                } else {
                    System.out.println("Senha incorreta.");
                }
            }
        }

        if (usuarios[2] instanceof UsuarioComum pedro) {
            if (pedro.autenticar("202020")) {
                System.out.println("Login realizado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        if (usuarios[0] instanceof UsuarioAdmin joao) {
            if (joao.autenticar("2020")) {
                System.out.println("Login realizado.");
            } else  {
                System.out.println("Senha incorreta.");
            }
        }

        for ( int i = 0; i < 4; i++ ) {
            if (usuarios[0] instanceof UsuarioAdmin joao) {
                if (joao.autenticar("202020")) {
                    System.out.println("Login realizado.");
                } else  {
                    System.out.println("Senha incorreta.");
                }
            }
        }
        for (Usuario a : usuarios) {
            a.exibir();
        }
    }
}
