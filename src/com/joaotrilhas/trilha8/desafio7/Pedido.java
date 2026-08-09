package com.joaotrilhas.trilha8.desafio7;

abstract class Pedido {

    private String cliente;
    private String status;

    public String getCliente() { return cliente; }
    public String getStatus() { return status; }

    protected void setStatus(String novoStatus) { this.status = novoStatus; }

    public Pedido(String cliente) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("Informe o cliente.");
        }
        this.cliente = cliente;
        status = "pendente";
    }

    abstract String getDescricao();
    abstract void confirmar();

    public void cancelar() {
        if (status.equals("cancelado")) {
            System.out.println("Bloqueado.");
        } else {
            status = "cancelado";
        }
    }

    public void exibir() {
        System.out.printf("%nCliente: %s | Status: %s%n" +
                        "Descrição: %s%n",
                            getCliente(),
                            getStatus(),
                            getDescricao());
    }
}
