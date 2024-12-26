package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva a média: ");
        double media = entrada.nextDouble();

        if (media >= 7.0 && media < 10.0){
            System.out.println("Aprovado!!!");
            System.out.println("Parabéns!!!");
        }

        if (media < 7.0 && media >= 4.5){
            System.out.println("Recuperação!!!");
        }

        boolean notaParaReprovacao = media < 4.5 && media >= 0.0;

        if (notaParaReprovacao){
            System.out.println("Reprovado!!!");
        }

        entrada.close();
    }
}
