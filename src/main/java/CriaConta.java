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

        primeiraConta.deposita (300);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita (100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita (2000);

        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

    }

}
