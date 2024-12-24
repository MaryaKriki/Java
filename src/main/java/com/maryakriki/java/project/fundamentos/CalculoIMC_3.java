package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class CalculoIMC_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // peso / (altura * altura)

        System.out.println("Escreva sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Escreva seu peso: ");
        double peso = entrada.nextDouble();

        double IMC = (peso / (altura * altura));
        System.out.print("Seu IMC é de " + IMC + " m²");

        entrada.close();
    }
}
