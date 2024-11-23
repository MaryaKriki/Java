package com.maryakriki.java.project.fundamentos;

public class ObjetoVsPrimitivo {
    public static void main(String[] args) {

        // String é um classe assim como ObjetoVsPrimitivo, o objeto é o valor atribuido á classe
        //ex.
        String s = new String("texto");
        //String = classe, "texto" = valor/objeto

        // as classes (ex. String) tem métodos dentro dele, ex. toUpperCase
        s.toUpperCase();

        // os Wrappers são uma versão de objeto para os tipos primitivos
        int a = 123;
        System.out.println(a);
    }
}
