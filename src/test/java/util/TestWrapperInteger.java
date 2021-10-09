package util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {
    public static void main(String[] args) {

        Integer idade = 29;

        int primitivo = new Integer(21);

        List<Integer> lista = new ArrayList<>();
        
       // lista.add(idadeRef); //ok
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);  //ok

        System.out.println(i1);  //29
        System.out.println(i2); //21
        
        Integer valorRef = Integer.valueOf(33);
        int valorPrimitivo1 = valorRef.intValue();

        System.out.println(valorPrimitivo1); //valor-33

        Integer valorPrimitivo2 = Integer.valueOf("33");
        int valorPrimitivo3 = Integer.parseInt("44");

        System.out.println(valorPrimitivo2); //valor-33
        System.out.println(valorPrimitivo3); //valor-//44

        System.out.println(Integer.MAX_VALUE); // tamanho 2^31 - 1
        System.out.println(Integer.MIN_VALUE); // tamanho -2^31

        System.out.println(Integer.SIZE); //  tamanho 32 bits
        System.out.println(Integer.BYTES); // tamanho 4 Bytes





    }
}