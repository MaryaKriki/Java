package com.maryakriki.java.project.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto( "Vestido", 52.98);
        //p1.nome = "Vestido Rosa";
        p1.cor = "Rosa";
        p1.preco = 45.90;

        var p2 = new Produto("Sapato", 27.90);
        //p2.nome = "Sapato Branco";
        p2.cor = "Branco";
        p2.preco = 23.99;
        Produto.desconto = 0.60;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("A média do carrinho é de " + mediaCarrinho + " reais.");
    }

}
