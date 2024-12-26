package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nota do aluno: ");

        double nota = entrada.nextDouble();

        if (nota > 10.0 || nota < 0.0){
            System.out.println("ERRO!!! Nota inválida!!!");
        } else if (nota >= 9.0){
            System.out.println("Aprovado!!!");
        } else if (nota >= 8.0){
            System.out.println("Aprovado!!!");
            System.out.println("Aprimoramento!!!");
        } else if (nota >= 6.0){
            System.out.println("Aprovado!!!");
            System.out.println("Reforço!!!");
        } else if (nota >= 3.0){
            System.out.println("Recuperação!!!");
        } else {
            System.out.println("Reprovado!!!");
        }

        entrada.close();
    }
}
