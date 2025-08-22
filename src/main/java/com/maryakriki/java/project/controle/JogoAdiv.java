package com.maryakriki.java.project.controle;

import java.util.Random;
import java.util.Scanner;

public class JogoAdiv {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Random random = new Random();

        System.out.println("Vamos jogar um jogo?");
        String resp1 = entrada.nextLine();
        if (resp1.equalsIgnoreCase("sim")){
            System.out.println("Ótimo!!!");
            System.out.println("Me deixe te explicar o jogo!!!");
            System.out.println("Eu vou gerar um número até 100\n    e você terá que adivinha-lo!!!");
            System.out.println("Você tem dez tentativas\n    eu te avisarei se o número digitado é maior ou menor que o número gerado!!!");
            System.out.println("Está pronto???");
            String resp2 = entrada.nextLine();
            if (resp2.equalsIgnoreCase("sim")){
                int num = random.nextInt(100);
                for (int contador = 10; contador > 0; contador--){
                    System.out.println("Digite o número: ");
                    int tentativa = entrada.nextInt();
                    if (tentativa > num){
                        System.out.println("O número gerado é menor que o número digitado!!!");
                        System.out.println("Você ainda tem " + contador + " tentativas!!!");}
                    if (tentativa < num){
                        System.out.println("O número gerado é maior que o número digitado!!!");
                        System.out.println("Você ainda tem " + contador + " tentativas!!!");}
                        else if (tentativa == num) {
                            System.out.println("Parabéns!!! Você acertou!!!");
                        }if (contador == 1) {
                        System.out.println("RÁ!!!\n Desculpe... suas tentativas acabaram!!!\nO número era " + num);
                    }
                    }
                }
            }
        else {
            System.out.println("Ok, até mais tarde");
        }

        entrada.close();
    }
}
