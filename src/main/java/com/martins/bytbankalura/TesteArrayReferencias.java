package com.martins.bytbankalura;

import java.util.ArrayList;

/**
 * @author Martins
 * @since 1.0
 * @version 1.0
 * 
 * 
 */

public class TesteArrayReferencias {

    public static void main(String[] args) {

    System.out.println("Demostração sem ArrayList");    
        ContaCorrente[] contas = new ContaCorrente[5];
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        referencias[1] = cc2;

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());
        
        ContaCorrente cc3 = contas[1];
        System.out.println(cc2.getNumero());
    //  System.out.println(ref.getNumero());
System.out.println("==============================================================");

            //Demostração com ArrayList
            //Generics | Tipificação      
            ArrayList    <Conta> lista = new ArrayList();

            Conta cc = new ContaCorrente(22, 11);
            lista.add(cc);

            Conta cc4 = new ContaCorrente(22, 22);
            lista.add(cc4);
/*

            System.out.println("Tamanho: " + lista.size());

            Conta ref = (Conta) lista.get(0);
            System.out.println(ref.getNumero());

            lista.remove(0);
            System.out.println("Tamanho: " + lista.size());

            Conta cc5 = new ContaCorrente(33, 311);
            lista.add(cc5);

            Conta cc6 = new ContaCorrente(33, 322);
            lista.add(cc6);

            for(int i = 0; i < lista.size(); i++) {
                Object oRef = lista.get(i);
                System.out.println(oRef);
            }

            System.out.println("----------");
*/

            boolean contem = lista.contains(cc4);
            System.out.println("Já existem ?" + contem);

            for(Object oRef : lista) {
                System.out.println(oRef);
            }
//=============================================================================
            //criação das contas omitidas

            boolean igual = cc1.ehIgual(cc2);
            System.out.println(igual); //deve imprimir true

         


    }
}