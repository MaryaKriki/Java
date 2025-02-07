package com.maryakriki.java.project.classe;

public class Produto {

    String nome;
    String cor;
    double preco;
    static double desconto = 0.25;

    public Produto(String nomeInicial, double precoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
