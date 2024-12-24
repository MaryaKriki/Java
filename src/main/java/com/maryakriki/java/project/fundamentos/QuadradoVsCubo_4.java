package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class QuadradoVsCubo_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número que queira: ");
        int num = entrada.nextInt();

        int quadrado = num * num;
        int cubo = num * num * num;
        System.out.println(num + "² = " + quadrado + "\n" + num + "³ = " + cubo);

        entrada.close();
    }
}
