package com.maryakriki.java.project.fundamentos.escola;

public class Aluno extends Pessoas{
    int serie;

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "serie=" + serie +
                ", cargo='" + cargo + '\'' +
                ", idade=" + idade +
                ", sobrenome='" + sobrenome + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
