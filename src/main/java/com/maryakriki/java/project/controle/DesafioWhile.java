package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String comando = "";
        double nota = 0;
        double total = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Por favor digite a sua nota");
            nota = entrada.nextDouble();
            total += nota;
            contador++;

        }

        double media;
        media = total / 3;

            System.out.println("A média é " + media);


        entrada.close();
    }
}
