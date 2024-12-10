package com.maryakriki.java.project.fundamentos;

public class DesafioOperadoresArit {
    public static void main(String[] args) {

        double numA = Math.pow(6 * (3 + 2), 2);
        int denA = 3 * 2;
        double divisaoA = numA / denA;
        System.out.println(divisaoA);

        double numB = (1 - 5) *  (2 - 7);
        double denB = 2;
        double divisaoB = Math.pow(numB / denB, 2);
        System.out.println(divisaoB);

        double numC = Math.pow(divisaoA - divisaoB, 3);
        double denC = Math.pow(10, 3);
        double divisaoC = (int) numC / denC;
        System.out.println("Resultado: " + divisaoC);

    }
}