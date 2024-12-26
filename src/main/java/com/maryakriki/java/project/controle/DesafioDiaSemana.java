package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo = 1 Segundo = 2 Terça = 3 Quarta = 4 Quinta = 5 Sexta = 6 Sábado = 7
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")){
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")){
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça")){
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")){
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")){
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")){
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado")){
            System.out.println(7);
        } else{
            System.out.println("Erro!!! Dia não existente!!!");
        }


        entrada.close();
    }
}
