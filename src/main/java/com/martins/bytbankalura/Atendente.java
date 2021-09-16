package com.martins.bytbankalura;

public class Atendente extends Funcionario {
    private String senha;

    public Atendente(String nome, String cpf, double salario, String senha) {}

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public double getBonificacao() {
        System.out.println("BONIFICAÇÃO DO ATENDENTE");
        return super.getBonificacao() + 100;
        }

    }

    

