package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class NumPrimosSwitch_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int n = entrada.nextInt();
        System.out.println("Escreva um número: ");

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                contador++;
            }
        }

        switch (contador){
            case 0:
                System.out.println("O número " + n + " é um número primo.");
                break;
            default:
                System.out.println("O número " + n + " não é um número primo.");

        }

        entrada.close();
    }
}
