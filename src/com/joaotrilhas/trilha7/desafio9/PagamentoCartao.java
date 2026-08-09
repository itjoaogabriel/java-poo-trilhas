package com.joaotrilhas.trilha7.desafio9;

public class PagamentoCartao extends Pagamento {

    private int numeroParcelas;
    public int getNumeroParcelas() { return numeroParcelas; }

    public PagamentoCartao(double valor, int numeroParcelas) {
        super(valor);
        if (numeroParcelas < 1 || numeroParcelas > 12) {
            throw new IllegalArgumentException("Informe um npumero de parcelas válidas.");
        }
        this.numeroParcelas = numeroParcelas;
    }
    @Override
    public void processar() {
        super.processar();
        System.out.format("Número parcelas: %d | Valor da parcela R$%.2f%n",
                            getNumeroParcelas(),
                            getValor() / numeroParcelas);
    }
}