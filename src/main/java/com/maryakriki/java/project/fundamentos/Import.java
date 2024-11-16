package com.maryakriki.java.project.fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
        /*
        Import serve para importar/trazer para a classe, de um determinado
         pacote, o acesso a demais classes que estejam em pacotes diferentes.
         */

        java.lang.String b = "Boa tarde";
        System.out.println(b);

        String s = "Bom dia!";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);

       // JButton botao = new JButton();
    }
}
