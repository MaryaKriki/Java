package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        // o System.out.print() (sem o ln) imprime na mesma linha sem pular linhas
        //obs. o \n/%n permite pular a linha sem o ln
        System.out.print("Bom");
        System.out.print(" dia!\n");

        // o System.out.println() (com o ln) imprime e já pula uma linha pra próxima impressão
        System.out.println("Bom");
        System.out.println("dia!");

        // o System.out.printf() (com f) permite imprimir dados na tela sem precisar concatenar
        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                0, 9, 1, 0, 9, 7);
        System.out.printf("Prêmio: R$%.2f%n", 145000.99);
        System.out.printf("Ganhador: %s %s %n", "João", "Silva");

        /*
         o Scanner é uma classe que tem função de escanear/monitorar o que esta sendo imprimido na tela
         o System.in permite imprimir pela entrada (ex. teclado) na tela
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n",
                nome, sobrenome, idade);

        entrada.close();
    }
}
