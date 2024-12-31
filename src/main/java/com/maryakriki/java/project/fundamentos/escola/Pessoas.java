package com.maryakriki.java.project.fundamentos.escola;

public class Pessoas {
    /*
    Nessa classe está:
      Professores: dá as aulas e ensina
      Funcionários: cuida da limpeza e da comida
      Alunos: assiste as aulas e estuda
     */
    String nome;
    String sobrenome;
    int idade;
    String cargo;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome(String júlia) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
