package com.maryakriki.java.project.fundamentos.operadores;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int numero = entrada.nextInt();
        System.out.println("Escreva outro número: ");
        int numero2 = entrada.nextInt();

        int modulo = numero % numero2;


        if (modulo % 2 == 0) {
            System.out.println("O modulo é par");
        }
        else {
            System.out.println("O modulo é ímpar");
        }

        entrada.close();
    }
}
