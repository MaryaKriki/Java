package com.maryakriki.java.project.fundamentos;

public class TestandoComOMeuPai {


    private String nome;
//Object
    public TestandoComOMeuPai(String nome) {
        this.nome = nome;
    }

//    @Override
//    public String toString() {
//        return "TestandoComOMeuPai{" +
//                "nome='" + nome + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        TestandoComOMeuPai q = new TestandoComOMeuPai("Ivo");
        System.out.println(q);
    }

}
