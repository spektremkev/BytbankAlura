/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

    }

}
