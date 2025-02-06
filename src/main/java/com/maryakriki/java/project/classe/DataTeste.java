package com.maryakriki.java.project.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();

        Data d2 = new Data(12, "Julho", 2025);

        System.out.println(d1.obterData());
        System.out.println("Data do meu aniversário de 15 anos: " + d2.dia + d2.mes + d2.ano);
    }
}
