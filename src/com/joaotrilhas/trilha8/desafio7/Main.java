package com.joaotrilhas.trilha8.desafio7;

public class Main {
    public static void main(String[] args) {

        Pedido[] pedidos = new Pedido[3];

        pedidos[0] = new PedidoFisico("Ana", "Rua da pedra nº 40", 20, 500);
        pedidos[1] = new PedidoFisico("Pedro", "Rua da lagoa nº 400", 0, 450);
        pedidos[2] = new PedidoDigital("João", 500);

        pedidos[0].confirmar();
        pedidos[1].confirmar();
        pedidos[2].cancelar();
        pedidos[2].cancelar();
        pedidos[0].cancelar();

        for (Pedido a : pedidos){
            a.exibir();
            if (a instanceof Pagavel p) {
                System.out.printf("Total: R$%.2f%n", p.calcularTotal());
            }
        }
    }
}
