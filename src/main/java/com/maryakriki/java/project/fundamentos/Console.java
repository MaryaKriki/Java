package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                0, 9, 1, 0, 9, 7);
        System.out.printf("Prêmio: R$%.2f%n", 145000.99);
        System.out.printf("Ganhador: %s %s %n", "João", "Kikri");

        Scanner entrada = new Scanner(System.in);

        entrada.nextLine();

    }
}
