package com.maryakriki.java.project.controle;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(100);

        System.out.println("Adivinhe um número de 0 a 100: ");
        int tentativa = entrada.nextInt();

        for (int contador = 10; contador > 0; contador--){
                if (tentativa < num && tentativa != num){
                    System.out.println("Você errou!! Tem mais " + contador + " tentativas.");
                    System.out.println("DICA: O número gerado é maior que o digitado.");
                    tentativa = entrada.nextInt();
                } else if (tentativa > num && tentativa != num){
                    System.out.println("Você errou!! Tem mais " + contador + " tentativas.");
                    System.out.println("DICA: O número gerado é menor que o digitado.");
                    tentativa = entrada.nextInt();
                }
                if (contador == 1){
                    System.out.println("Acabou suas tentativas o número era " + num);
                }

        }

        if (tentativa == num){
            System.out.println("Parabéns você adivinhou!!!");
        }

        entrada.close();
    }
}
