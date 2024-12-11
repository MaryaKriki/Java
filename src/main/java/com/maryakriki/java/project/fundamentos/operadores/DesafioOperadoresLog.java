package com.maryakriki.java.project.fundamentos.operadores;

public class DesafioOperadoresLog {
    public static void main(String[] args) {
       // Trabalho na terça (V ou F)
       // Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = !trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 && trabalho2;
        boolean nada = !trabalho1 && !trabalho2;

        System.out.println("Vamos comprar a TV ? " + tv50 + ", e tomar sorteve? " + sorvete);
        System.out.println("Vamos comprar uma TV de 50 polegadas e tomar sorteve!!");

        System.out.println("\nVamos comprar a TV ? " + tv32 + ", e tomar sorteve? " + sorvete);
        System.out.println("Vamos comprar uma TV de 35 polegadas e tomar sorteve!!");

        System.out.println("\nVamos comprar a TV e tomar sorteve? " + nada);
        System.out.println("Vamos ficar sem a TV e sem sorvete!!");

    }
}
