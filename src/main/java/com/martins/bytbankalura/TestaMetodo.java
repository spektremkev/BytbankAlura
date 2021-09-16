package com.martins.bytbankalura;

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

        Conta contaDoPaulo = new Conta(7456,10000);
        contaDoPaulo.deposita(100);

        contaDoPaulo.deposita(100);
        System.out.println("paulo"+contaDoPaulo.getSaldo());
        contaDoPaulo.saca(50);
        System.out.println("paulo"+contaDoPaulo.getSaldo());
        contaDoPaulo.saca(150);
        System.out.println("paulo"+contaDoPaulo.getSaldo());

        boolean conseguiuSacar = contaDoPaulo.saca(501);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(conseguiuSacar);

        Conta contaDaMaria = new Conta(1245,789);

        

        if(contaDaMaria.transfere(300, contaDoPaulo)){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Transferência não realizada");
        }

        contaDaMaria.transfere(300, contaDoPaulo);
        System.out.println(contaDaMaria.getSaldo());
    }
}