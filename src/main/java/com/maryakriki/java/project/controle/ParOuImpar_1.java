package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class ParOuImpar_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = entrada.nextInt();

        if (valor <= 10 && valor >= 0) {
            System.out.println("Seu número está entre 0 e 10.");
        } else {
            System.out.println("Seu número não está entre 0 e 10.");
        }

        if (valor %2 == 0) {
            System.out.println("Seu número é par.");
        } else if (valor %2 == 1) {
            System.out.println("Seu número é ímpar.");
        }

        entrada.close();
    }
}
