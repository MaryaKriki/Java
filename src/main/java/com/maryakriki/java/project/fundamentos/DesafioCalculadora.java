package com.maryakriki.java.project.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("_______________________CALCULADORA_______________________");

        int num1 = entrada.nextInt();
        String oper = entrada.next();
        int num2 = entrada.nextInt();

        // double resultado = "+".equals(oper) ? num1 + num2 : 0;
        // resultado = "-".equals(oper) ? num1 - num2 : 0;
        // resultado = "*".equals(oper) ? num1 * num2 : 0;
        // resultado = "/".equals(oper) ? num1 / num2 : 0;
        // resultado = "%".equals(oper) ? num1 % num2 : 0;

        if (oper.equals("+")){
            System.out.println(num1 + num2);
        }

        if (oper.equals("-")){
            System.out.println(num1 - num2);
        }

        if (oper.equals("*")){
            System.out.println(num1 * num2);
        }

        if (oper.equals("/")){
            System.out.println(num1 / num2);
        }

        if (oper.equals("%")){
            System.out.println(num1 % num2);
        }

        entrada.close();
    }
}
