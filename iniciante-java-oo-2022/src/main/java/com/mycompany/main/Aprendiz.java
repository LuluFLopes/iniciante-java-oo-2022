package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class Aprendiz extends MovimentoCodar implements Alura {

    private int experiencia;
    private String habilidade = "Logica de Programacao";

    public Aprendiz() {

    }

    public Aprendiz(int numCadastro, String nome, int idade, int experiencia) {

        setNumCadastro(numCadastro);
        setNome(nome);
        setIdade(idade);

    }

    public void duvidaTecnica(String msg) {

        throw new DuvidaTecnicaException(msg);

    }

    public void duvidaProcesso(String msg) throws DuvidaProcessoException {

        throw new DuvidaProcessoException(msg);

    }

    @Override
    public void aula(int experiencia, String habilidade) {
        this.experiencia = experiencia;
        this.habilidade += ", " + habilidade;
    }

    public void compartilhaResultado() {

        System.out.println("Total de exp adquirida: " + experiencia);
        System.out.println("Total de habilidades adquiridas: " + habilidade);

    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(int numCadastro) {
        this.numCadastro = numCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
