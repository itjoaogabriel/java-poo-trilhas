package com.joaotrilhas.trilha7.desafio9;

public class PagamentoBoleto extends Pagamento {

    private String dataVencimento;
    public String getDataVencimento() { return dataVencimento; }

    public PagamentoBoleto(double valor, String dataVencimento) {
        super(valor);
        if (dataVencimento == null || dataVencimento.isEmpty()) {
            throw new IllegalArgumentException("Informe a data de vencimento..");
        }
        this.dataVencimento = dataVencimento;
    }
    @Override
    public void processar() {
        super.processar();
        System.out.println("Data de vencimento: " + getDataVencimento());
    }
}
