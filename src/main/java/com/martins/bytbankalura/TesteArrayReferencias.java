package com.martins.bytbankalura;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TesteArrayReferencias {

    public static void main(String[] args) {

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
    }

}