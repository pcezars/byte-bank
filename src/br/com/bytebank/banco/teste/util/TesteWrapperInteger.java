package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);
        int valor = idadeRef.intValue();
        System.out.println(idadeRef.doubleValue());


        String s = args[0]; //"10"
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);
    }
}
