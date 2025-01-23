package com.maryakriki.java.project.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 23;
        d1.mes = " / Janeiro / ";
        d1.ano = 2025;

        Data d2 = new Data();
        d2.dia = 12;
        d2.mes = " / Julho / ";
        d2.ano = 2025;

        System.out.println("Data de hoje: " + d1.dia + d1.mes + d1.ano);
        System.out.println("Data do meu aniversário de 15 anos: " + d2.dia + d2.mes + d2.ano);
    }
}
