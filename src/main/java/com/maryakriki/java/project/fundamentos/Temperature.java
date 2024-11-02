package com.maryakriki.java.project.fundamentos;

public class Temperature {
    public static void main(String[] args) {
       // (°F - 32) * 5/9 = °C

        final double AJUSTE = 32;
        final double CONVERSAO = 5.0 / 9.0;

        double F = 64;
        double C = ( F - AJUSTE ) * CONVERSAO;

        System.out.println( F + " Fahrennheit é o mesmo que " + C + " graus Celsius.");

    }
}
