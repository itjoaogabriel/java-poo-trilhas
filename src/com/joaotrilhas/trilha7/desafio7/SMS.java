package com.joaotrilhas.trilha7.desafio7;

public class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    @Override
    public void enviar() {
        super.enviar();
        System.out.println("SMS enviado.");
        System.out.println();
    }
}
