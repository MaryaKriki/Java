package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String comando = "";
        double nota = 0;

        System.out.println("Bom dia!!!");
        comando = entrada.nextLine();

        while (!comando.equalsIgnoreCase("361425")) {
            System.out.println("ERRO!!! SENHA INCORRETA\nBom dia!!!");
            comando = entrada.nextLine();
        }
        if (comando.equalsIgnoreCase("361425")) {
            System.out.println("\nBem-vindo!!!");
        }

        int contador = 1;
        double media;
        do {
            System.out.println("Por favor digite sua nota: ");
            nota = entrada.nextDouble();
            contador++;
            media = (nota * 3) / 3;
        } while (contador <= 3);
        if (nota > 10) {
            System.out.println("ERRO!!! Nota inválida!!!");
        }
        if (nota < 0) {
            System.out.println("ERRO!!! Nota inválida!!!");
        }
        System.out.println(media);
        System.out.println("Até mais!!!");

        entrada.close();
    }
}
