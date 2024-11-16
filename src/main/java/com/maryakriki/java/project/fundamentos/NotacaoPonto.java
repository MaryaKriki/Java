package com.maryakriki.java.project.fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        /*
         O ponto (.) é usado para chamar algum metodo ou atributo
         Exemplo: System.out.println(); o primeiro ponto chama o metodo de saída do programa "out"
          e o segundo ponto chama o metodo de imprimir linha "println"
         */

        String b = "Bom Dia X";
        b = b.replace("X", "Senhora");
        b = b.toUpperCase();
        b = b.concat("!!!");

        System.out.println(b);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom Dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}
