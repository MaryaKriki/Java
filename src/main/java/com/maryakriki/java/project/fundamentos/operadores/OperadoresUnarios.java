package com.maryakriki.java.project.fundamentos.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

         a++; //a = a + 1
         a--; //a = a - 1

         ++b; //b = b + 1
         --b; //b = b - 1
         System.out.println(a);
         System.out.println(b);

         System.out.println("Mini desafio...");
         System.out.println(++a == b--);
         System.out.println(a == b);

         System.out.println(a);
         System.out.println(b);
//         var lista = 3;
//        for(int i = 0; i < lista.length; i++) {
//            System.out.println( lista[i] );
//        }

    }
}
