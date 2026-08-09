package com.joaotrilhas.trilha6.desafio4;

public class ProdutoEletronico extends Produto{

    private int garantiaMeses;
    private String voltagem;

    public int getGarantiaMeses() { return garantiaMeses; }
    public String getVoltagem() { return voltagem; }

    public ProdutoEletronico(String nome, double preco, int estoque, int garantiaMeses, String voltagem) {
        super(nome, preco, estoque);
        if (garantiaMeses < 0) {
            throw new IllegalArgumentException("A garantia não pode ser negativa.");
        }
        if (!voltagem.equals("110V") && !voltagem.equals("220V") && !voltagem.equals("Bivolt") ) {
            throw new IllegalArgumentException("Informe uma voltagem válida.");
        }
        this.garantiaMeses = garantiaMeses;
        this.voltagem = voltagem;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Garantia: %d meses | Voltagem: %s%n",
                            getGarantiaMeses(),
                            getVoltagem());
    }
}
