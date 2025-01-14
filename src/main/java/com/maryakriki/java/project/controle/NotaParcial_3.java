package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class NotaParcial_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva sua nota na prova que valia 4,0 pontos: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Escreva sua nota na prova que valia 6,0 pontos: ");
        double nota2 = entrada.nextDouble();

        double media = nota1 + nota2;

        if (media >= 7.0) {
            System.out.println(media + "\nAprovado!!!\nParabéns!!!");
        } else if (media >= 4.0) {
            System.out.println(media + "\nRecuperação!!!\nBoa sorte!!!");
        } else if (media < 4.0) {
            System.out.println(media + "\nReprovado!!!\nMelhore na próxima!!!");
        }

        entrada.close();
    }
}
