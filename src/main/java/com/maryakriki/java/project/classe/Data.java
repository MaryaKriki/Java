package com.maryakriki.java.project.classe;

public class Data {
    int dia;
    String mes;
    int ano;

    Data(){
        dia = 1;
        mes = "Janeiro";
        ano = 1970;

    }
    
    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData(){
        return String.format("Data de hoje: " + this.dia + this.mes + this.ano);
    }
}
