package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        //Desafio Extra: Na hora de digitar o  valor numerico no console,
        // eu tenho que conseguir usar tanto a vírgula quanto o ponto
        //Resposta: Como o número foi convertido em String podemos usar os
        // métodos da classe String, .replace(",",".");

        Scanner salario = new Scanner(System.in);

        System.out.println("Digite seu salario do primeiro mês: ");
        String salario1 = salario.nextLine().replace(",",".");

        System.out.println("Digite seu salario do segundo mês: ");
        String salario2 = salario.nextLine().replace(",",".");

        System.out.println("Digite seu salario do terceiro mês: ");
        String salario3 = salario.nextLine().replace(",",".");


        double val1 = Double.parseDouble(salario1);
        double val2 = Double.parseDouble(salario2);
        double val3 = Double.parseDouble(salario3);

        double soma = val1 + val2 + val3;
        System.out.println("O total desse trimestre foi: " + soma);
        System.out.println("Sua média por mês é: " + soma / 3);

        salario.close();
    }
}
