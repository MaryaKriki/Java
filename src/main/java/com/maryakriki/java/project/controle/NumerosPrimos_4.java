package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class NumerosPrimos_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        System.out.println("Escreva um número: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " não é primo.");

        }

        entrada.close();
    }
}
