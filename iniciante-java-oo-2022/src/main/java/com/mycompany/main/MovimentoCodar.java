package com.mycompany.main;

/**
 *
 * @author lucme
 */
public abstract class MovimentoCodar extends BlueSoft {

    protected int numCadastro;
    protected String nome;
    protected int idade;

    public MovimentoCodar() {

    }

    public void setNumCadastro(int numCadastro) {
        this.numCadastro = numCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
