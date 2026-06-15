package com.joaotrilhas.trilha4.desafio9;

public class SistemaRhTeste {
    public static void main(String[] args) {

        Departamento departamento = new Departamento();

        departamento.setNome("Administrativo");
        departamento.setOrcamento(10000);
        departamento.gastar(11000);
        departamento.gastar(2000);

        Cargo cargo1 = new Cargo();
        Cargo cargo2 = new Cargo();

        cargo1.setTitulo("Analista adm");
        cargo1.setNivel(10);
        cargo1.setNivel(3);
        cargo1.setSalarioBase(5000.0);

        cargo2.setTitulo("Assistente adm");
        cargo2.setNivel(3);
        cargo2.setSalarioBase(2500.0);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setNome("Ana");
        funcionario1.setCargo(cargo1);
        funcionario1.promover(4);

        funcionario2.setNome("Paula");
        funcionario2.setCargo(cargo2);
        funcionario2.desligar();

        funcionario3.setNome("José");
        funcionario3.setCargo(cargo2);
        funcionario3.desligar();

        System.out.format("Nome: %s | Cargo: %s | Nível: %d | Salário base R$%.2f | Situação: %b%n" +
                        "Salário com bônus R$%.2f%n%n",
                        funcionario1.getNome(), funcionario1.getCargo().getTitulo(), cargo1.getNivel(), cargo1.getSalarioBase(),
                        funcionario1.isAtivo(), cargo1.getSalarioComBonus());

        System.out.format("Nome: %s | Cargo: %s | Nível: %d | Salário base R$%.2f | Situação: %b%n" +
                        "Salário com bônus R$%.2f%n%n",
                        funcionario2.getNome(), funcionario2.getCargo().getTitulo(), cargo2.getNivel(),
                        cargo2.getSalarioBase(), funcionario2.isAtivo(), cargo2.getSalarioComBonus());

        System.out.format("Nome: %s | Cargo: %s | Nível: %d | Salário base R$%.2f | Situação: %b%n" +
                        "Salário com bônus R$%.2f%n%n",
                funcionario3.getNome(), funcionario3.getCargo().getTitulo(), cargo2.getNivel(), cargo2.getSalarioBase(),
                funcionario3.isAtivo(), cargo2.getSalarioComBonus());

        System.out.format("Orcamento final R$%.2f", departamento.getOrcamento());

    }
}
