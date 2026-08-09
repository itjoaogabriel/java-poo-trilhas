package com.joaotrilhas.trilha7.desafio7;

public class Notificacao {

    private String destinatario;
    private String mensagem;

    public String getDestinatario() { return destinatario; }
    public String getMensagem() { return mensagem; }

    public Notificacao(String destinatario, String mensagem) {
        if (destinatario == null || destinatario.isEmpty()) {
            throw new IllegalArgumentException("Informe um destinatário.");
        }
        if (mensagem == null || mensagem.isEmpty()) {
            throw new IllegalArgumentException("Informe uma mensagem.");
        }
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void enviar() {
        System.out.printf("Destinatário: %s%nMensagem enviada: %s%n",
                getDestinatario(),
                getMensagem());
    }
}
