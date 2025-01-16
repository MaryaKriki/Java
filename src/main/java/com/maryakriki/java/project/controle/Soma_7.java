package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class Soma_7 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);


        int num1 = 0;
        int soma = 0;


        while (num1 >= 0){
            System.out.println("Escreva um número inteiro (se quiser sair escreva um número negativo): ");
            num1 = entrada.nextInt();
            if (num1 >= 0){
                soma += num1;
                System.out.println("A soma de tudo até agora é de: " + soma);
            }
        }

        entrada.close();
    }
}
