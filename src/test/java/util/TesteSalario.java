package util;

import com.martins.bytbankalura.Gerente;
import com.martins.bytbankalura.Funcionarios.Funcionario;

public class TesteSalario {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario();
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Fulano");
        funcionario.setCargo("Diretor");
        funcionario.setSalario(3000.0);
        
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getSalario());
    }
}
