package com.joaotrilhas.trilha6.desafio7;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Pop", "Cachorro", 6, "Shitzu", false);
        Cachorro cachorro2 = new Cachorro("Luppy", "Cachorro", 10, "Show show", true);
        Passaro passaro1 = new Passaro("Juju", "Pássaro", 0.5, 2, true);
        Passaro passaro2 = new Passaro("Jajá", "Pássaro", 0.4, 1, false);
        Peixe peixe1 = new Peixe("Lulu", "Peixe", 2, 100, true);
        Peixe peixe2 = new Peixe("Lola", "Peixe", 10, 1000, true);

        cachorro1.exibir();
        cachorro1.buscar();
        cachorro2.exibir();
        cachorro2.buscar();
        passaro1.exibir();
        passaro1.voar();
        passaro2.exibir();
        passaro2.voar();
        peixe1.exibir();
        peixe1.nadar();
        peixe2.exibir();
        peixe2.nadar();
    }
}