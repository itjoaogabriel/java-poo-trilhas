package com.joaotrilhas.trilha8.desafio7;

public class PedidoFisico extends Pedido implements Pagavel {

    private String endereco;
    private double frete;
    private double valorItens;

    public String getEndereco() { return endereco; }
    public double getFrete() { return frete; }
    public  double getValorItens() { return valorItens; }

    public PedidoFisico(String cliente, String endereco, double frete, double valorItens) {
        super(cliente);
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Informe o endereço.");
        }
        if (frete < 0) {
            throw new IllegalArgumentException("Informe o frete.");
        }
        if (valorItens <= 0) {
            throw new IllegalArgumentException("Informe o valor dos itens.");
        }

        this.endereco = endereco;
        this.frete = frete;
        this.valorItens = valorItens;
    }

    @Override
    public String getDescricao() { return "Pedido Fisico"; }

    @Override
    public void confirmar() {
        setStatus("Confirmado - Aguardando a entrega.");
    }

    @Override
    public void cancelar() {
        if (getStatus().equals("cancelado")) {
            System.out.printf("Pedido do cliente %s bloqueado.%n", getCliente());
        } else {
            setStatus("cancelado");
        }
    }

    @Override
    public double calcularTotal() {
        return valorItens + frete;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Valor itens: R$%.2f%nValor total: R$%.2f | " +
                        "Frete: R$%.2f%n" +
                        "Endereço: %s%n",
                            getValorItens(),
                            calcularTotal(),
                            getFrete(),
                            getEndereco());
    }
}
