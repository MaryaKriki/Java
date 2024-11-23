package com.maryakriki.java.project.fundamentos;

public class ObjetoVsPrimitivo {
    public static void main(String[] args) {

        // String é um classe assim como ObjetoVsPrimitivo, o objeto é o valor atribuido á classe
        //ex.
        String s = new String("texto");
        //String = classe, "texto" = valor/objeto

        s.toUpperCase();
        // as classes (ex. String) tem métodos dentro dele, ex. toUpperCase

        int a = 123;
        // tipos primitivos não têm classes, então os seus "objetos" são na verdade Wrappers
    }
}
