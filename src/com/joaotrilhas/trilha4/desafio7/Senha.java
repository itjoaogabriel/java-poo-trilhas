package com.joaotrilhas.trilha4.desafio7;

public class Senha {

    private String valor;
    private int tentativas;

    public String getValor() {
        return valor;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setValor(String valor) {
        boolean temNumero = false;

        if (valor.length() >= 8) {
            for (int i = 0; i < valor.length(); i++) {
                if (Character.isDigit((valor.charAt(i)))) {
                    temNumero = true;
                    break;
                }
            }
            if (temNumero) {
                this.valor = valor;
            } else {
                System.out.println("A senha deve conter pelo menos um dígito.");
            }
        } else {
            System.out.println("Senha deve ter no mínimo 8 caracteres.");
        }
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public boolean verificar(String tentativa) {
        if (isBloqueada()) {
            System.out.println("Conta bloqueada. Use resetar() para desbloquear.");
            return false;
        }
        if (tentativa.equals(valor)) {
            return true;
        } else {
            tentativas++;
            return false;
        }
    }

    public boolean isBloqueada() {
        return tentativas >= 3;
    }

    public void resetar() {
        tentativas = 0;
    }
}