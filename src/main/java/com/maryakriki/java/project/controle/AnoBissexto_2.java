package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class AnoBissexto_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite em que ano estamos: ");
        int ano = entrada.nextInt();
        if (ano %4 == 0){
            System.out.println("Esse ano é bissexto, aproveite o 29 de fevereiro!!");
        } else {
            System.out.println("Esse ano é um ano normal.");
        }

        entrada.close();
    }
}
