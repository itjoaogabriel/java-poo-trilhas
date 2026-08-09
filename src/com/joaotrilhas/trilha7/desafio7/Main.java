package com.joaotrilhas.trilha7.desafio7;

public class Main {
    public static void main(String[] args) {

        Notificacao[] notificacoes = new Notificacao[4];

        notificacoes[0] = new Email("Ana", "Vai dormir.", "oi?");
        notificacoes[1] = new Email("Valdivino", "Acorda.", "vamos?");
        notificacoes[2] = new SMS("Rosana", "Traz o bolo.");
        notificacoes[3] = new PushNotification("Sarah", "Vem logo.", "Instagram");

        for (Notificacao a:notificacoes) {
            a.enviar();
        }
    }
}