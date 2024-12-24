package com.maryakriki.java.project.fundamentos;

public class Bhaskara_6 {
    public static void main(String[] args) {
        //ax²+bx+c
        //delta = 12²-4*1*(-13) = 196
        //bhaskara = -12 +/- 14/2 = x¹ = 1
        String e = "ax2 + bx + c = 0";
        int a = 1;
        int b = 12;
        int c = -13;
        int delta = b * b - 4 * a * c;
        int bhaskara = 2 / 2 * a;

        System.out.println(e);
        System.out.println("O delta é: " + delta);
        System.out.println(" x = " + bhaskara);


    }
}
