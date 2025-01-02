package com.maryakriki.java.project.controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Diga: ");
            valor = entrada.nextLine();
            if (valor.equalsIgnoreCase("diga")){
                System.out.print("Ta me imitando é?\n");
            }
            if (valor.equalsIgnoreCase("oi")){
                System.out.print("Olá \n");
            }
            if (valor.equalsIgnoreCase("como vc esta?")){
                System.out.println("Bem e você?\n");
            }
            if (valor.equalsIgnoreCase("como vai?")){
                System.out.println("Bem e você?\n");
            }
            if (valor.equalsIgnoreCase("tudo bem?".replace("e", "o"))){
                System.out.println("Bem e você?\n");
            }
        }


        entrada.close();
    }
}
