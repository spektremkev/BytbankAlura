package com.martins.bytbankalura.Funcionarios;

public class SistemaInterno {
    private int senha;


    public void autentica(Gerente g) {
        boolean autentica = g.autenticar(this.senha);
        if (autentica) {
            System.out.println("Bem vindo gerente!");
        } else {
            System.out.println("Senha incorreta!");
        }

    }
    
}
