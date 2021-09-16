package com.martins.bytbankalura;

public class TesteSalario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fulano");
        funcionario.setCargo("Diretor");
        funcionario.setSalario(3000.0);
        
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getSalario());
    }
}
