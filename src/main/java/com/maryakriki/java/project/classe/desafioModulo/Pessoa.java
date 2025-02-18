package com.maryakriki.java.project.classe.desafioModulo;

public class Pessoa{
    public String nome;
    public double peso;

    public Pessoa(String n, double p) {
        this.nome = n;
        this.peso = p;
    }

    public void comer(Comida comida){
        this.peso += comida.pesoc;
    }
    public void apresentar(){
        System.out.println(nome + " está com " + peso + " kg.");
    }
}
