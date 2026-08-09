package com.joaotrilhas.trilha7.desafio9;

public class PagamentoPix extends Pagamento {

    private String chavePix;
    public String getChavePix() { return chavePix; }

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        if (chavePix == null || chavePix.isEmpty()) {
            throw new IllegalArgumentException("Informe uma chave pix.");
        }
        this.chavePix = chavePix;
    }
    @Override
    public void processar() {
        super.processar();
        System.out.println("Pagamento confirmado instantaneamente.");
    }
}
