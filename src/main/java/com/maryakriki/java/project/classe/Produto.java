package com.maryakriki.java.project.classe;

public class Produto {

    String nome;
    String cor;
    double preco;
    double desconto;

    public Produto(String nomeInicial, double precoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;
        this.desconto = precoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
