package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class Area_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //largura * altura * altura = ?³

        System.out.println("Descreva a altura do triângulo: ");
        double altura = entrada.nextDouble();
        System.out.println("Descreva a largura do triângulo: ");
        double largura = entrada.nextDouble();

        double area2 = altura * largura;
        System.out.println("A área é de " + area2 + "².");

        entrada.close();
    }
}
