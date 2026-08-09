package com.joaotrilhas.trilha8.desafio5;

abstract class Relatorio {

    private String titulo;
    private String data;

    public String getTitulo() { return titulo; }
    public String getData() { return data; }

    public Relatorio(String titulo, String data) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Informe um titulo.");
        }
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Informe uma data.");
        }
        this.titulo = titulo;
        this.data = data;
    }

    abstract String gerarConteudo();
    abstract int calcularTotalPaginas();

    public void exibir() {
        System.out.printf("%nTítulo: %s%nData: %s | Quantidade páginas: %d%n" +
                        "Conteúdo: %s%n",
                        getTitulo(),
                        getData(),
                        calcularTotalPaginas(),
                        gerarConteudo());
    }
}
