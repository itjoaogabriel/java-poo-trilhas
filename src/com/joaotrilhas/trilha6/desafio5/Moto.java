package com.joaotrilhas.trilha6.desafio5;

public class Moto extends Veiculo {

    private int cilindrada;
    private boolean temSidecar;

    public int getCilindrada() { return cilindrada; }
    public boolean isTemSidecar() { return temSidecar; }

    public Moto(String marca, String modelo, int ano, double quilometragem, int cilindrada, boolean temSidecar) {
        super(marca, modelo, ano, quilometragem);
        if (cilindrada < 0) {
            throw new IllegalArgumentException("Informe a cilindrada do veículo.");
        }
        this.cilindrada = cilindrada;
        this.temSidecar = temSidecar;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Cilindrada: %dcc | Sidecar: %s%n",
                            getCilindrada(),
                            isTemSidecar() ? "Possui" : "Não possui");
    }
}
