package com.maryakriki.java.project.fundamentos.operadores;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int numero = entrada.nextInt();

        numero %= 2;


        if (numero == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }

        entrada.close();
    }
}
