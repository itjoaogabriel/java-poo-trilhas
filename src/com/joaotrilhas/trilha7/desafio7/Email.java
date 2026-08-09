package com.joaotrilhas.trilha7.desafio7;

public class Email extends Notificacao {

    private String assunto;
    public String getAssunto() { return assunto; }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        if (assunto == null || assunto.isEmpty()){
            throw new IllegalArgumentException("Informe um assunto.");
        }
        this.assunto = assunto;
    }
    @Override
    public void enviar() {
        System.out.println("Assunto: " + getAssunto());
        super.enviar();
        System.out.println();
    }
}
