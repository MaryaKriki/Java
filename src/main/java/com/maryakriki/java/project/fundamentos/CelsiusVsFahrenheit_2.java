package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class CelsiusVsFahrenheit_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //(C * 9/5) + 32

        final double ajuste = 9.0/5.0;

        System.out.println("Escreva a temperatura (Cº) : ");
        int c = entrada.nextInt();
        var f = (c * ajuste) + 32;

        System.out.println("Está " + f + " graus Fahrenheit.");

        entrada.close();
    }
}
