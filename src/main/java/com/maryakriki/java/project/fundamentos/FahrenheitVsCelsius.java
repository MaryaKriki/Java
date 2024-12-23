package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class FahrenheitVsCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // (°F - 32) * 5/9 = °C

        final double ajuste = 5.0/9.0;

        System.out.println("Escreva a temperatura (Fº) : ");
        int f = entrada.nextInt();
        var c = (f - 32) * ajuste;

        System.out.println("Está " + c + " graus Celsius.");

        entrada.close();
    }
}
