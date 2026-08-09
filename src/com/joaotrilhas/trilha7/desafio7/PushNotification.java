package com.joaotrilhas.trilha7.desafio7;

public class PushNotification extends Notificacao {

    private String tituloAPP;
    public String getTituloAPP() { return tituloAPP; }

    public PushNotification(String destinatario, String mensagem, String tituloAPP) {
        super(destinatario, mensagem);
        if (tituloAPP == null || tituloAPP.isEmpty()){
            throw new IllegalArgumentException("Informe o título do app.");
        }
        this.tituloAPP = tituloAPP;
    }
    @Override
    public void enviar() {
        super.enviar();
        System.out.printf("Push enviado pelo app: %s%n", getTituloAPP());
    }
}
