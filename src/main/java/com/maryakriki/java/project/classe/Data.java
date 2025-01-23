package com.maryakriki.java.project.classe;

public class Data {
    int dia;
    String mes;
    int ano;

    String obterData(){
        return String.format("Data de hoje: " + this.dia + this.mes + this.ano);
    }
}
