package com.martins.bytbankalura.Funcionarios;

public class Gerente extends Funcionario {

     double salario;
    private int senha;
    
    //private int senhaTentativas;
    
    public double getBonificacao(){
        System.out.println("Gerente Bonificação: ");
        return getBonificacao() + super.getSalario();
    }

    public boolean autenticar(int senha2){
        if (this.senha == senha2) {
			return true;
		} else {
			return false;
		}
	}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}

