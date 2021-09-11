//import com.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class TestaMetodo {
    public static void main(String[] args){

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo= 500;

        contaDoPaulo.deposita(100);
        System.out.println("paulo"+contaDoPaulo.saldo);
        contaDoPaulo.saca(50);
        System.out.println("paulo"+contaDoPaulo.saldo);
        contaDoPaulo.saca(150);
        System.out.println("paulo"+contaDoPaulo.saldo);

        boolean conseguiuSacar = contaDoPaulo.saca(501);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaMaria = new Conta();

        

        if(contaDaMaria.transfere(300, contaDoPaulo)){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Transferência não realizada");
        }

        contaDaMaria.transfere(300, contaDoPaulo);
        System.out.println(contaDaMaria.saldo);
    }
}