package com.maryakriki.java.project.controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // if (bool);
        // while (bool);
        // for (;bool;);

        String parente = "filha";

        switch (parente.toLowerCase()){
            case "vó":
                System.out.println("Sei fazer pão.");
            case "mãe":
                System.out.println("Sei fazer bolo.");
            case "filha":
                System.out.println("Sei fazer carne.");
            case "neta":
                System.out.println("Sei fazer arroz.");
        }
        System.out.println("Eu sou " + parente);

        int idade = 3;

        switch (idade){
                case 3:
                    System.out.println("Eu sei comer.");
                case 2:
                    System.out.println("Eu sei andar.");
                case 1:
                    System.out.println("Eu sei falar.");
                case 0:
                    System.out.println("Eu sei respirar.");
        }
    }
}
