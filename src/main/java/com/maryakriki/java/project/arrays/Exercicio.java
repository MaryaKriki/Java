package com.maryakriki.java.project.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double [] notaAlunoA = new double[3];
        System.out.println(Arrays.toString(notaAlunoA));

        notaAlunoA[0] = 8.9;
        notaAlunoA[1] = 6.7;
        notaAlunoA[2] = 7;

        System.out.println(Arrays.toString(notaAlunoA));

        double total = 0;
        for (int i = 0; i < 3; i++){
            total += notaAlunoA[i];
        }

        System.out.println(total / 3);

        System.out.println(Arrays.toString(notaAlunoA));
    }
}
