package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class MaiorNum_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorNum = 0;
        int contador = 0;

        do {
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();

            if (num > maiorNum) {
                maiorNum = num;
            }
            contador++;

        } while (contador != 10);

        System.out.println("O maior número é o " + maiorNum);
        entrada.close();
    }
}
