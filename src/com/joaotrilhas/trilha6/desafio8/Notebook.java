package com.joaotrilhas.trilha6.desafio8;

public class Notebook extends Dispositivo {

    private String processador;
    private int memoriaRam;

    public String getProcessador() { return processador; }
    public int getMemoriaRam() { return memoriaRam; }

    public Notebook(String marca, String modelo, double preco, String processador, int memoriaRam) {
        super(marca, modelo, preco);
        if (processador == null || processador.isEmpty()) {
            throw new IllegalArgumentException("Informe o processador do Notebook.");
        }
        if (memoriaRam < 0) {
            throw new IllegalArgumentException("Os Gb da memória ram não pode ser negativo.");
        }
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }
    @Override
    public void exibir() {
        System.out.println("Notebook");
        System.out.format("Processador: %s | Memória ram: %dGb%n",
                getProcessador(),
                getMemoriaRam());
        super.exibir();
    }
}
