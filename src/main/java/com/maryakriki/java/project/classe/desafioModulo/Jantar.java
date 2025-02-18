package com.maryakriki.java.project.classe.desafioModulo;

public class Jantar{
    public static void main(String[] args) {
        Comida c1 = new Comida("feijão", 0.45);

        Pessoa p1 = new Pessoa("Marya", 50.45);{
            p1.apresentar();
            p1.comer(c1);
            p1.apresentar();
        }
    }









}
