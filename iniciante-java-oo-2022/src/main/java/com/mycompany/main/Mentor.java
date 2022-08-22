package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class Mentor extends Organizador {

    private Aprendiz ap;
    private String desafio;
    private String resposta;
    private int experiencia;

    public Mentor() {

    }

    public Mentor(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
        ap = new Aprendiz();
    }

    public void compartilhaExperiencia() {
        this.experiencia = 2;
        ap.setExperiencia(ap.getExperiencia() + experiencia);
        System.out.println("Novo nivel de esperiencia do Aluno: " + ap.getExperiencia());
    }

    public void criaDesafio(String desafio) {
        this.desafio = desafio;
        System.out.println("Desafio criado por " + this.nome + ", fazer " + desafio + "!");

    }

    public void revisaDesafio() {
        if (this.desafio != null) {
            System.out.println("O desafio esta bem formulado!");
        } else {
            System.out.println("O desafio ainda precisa de melhorias!");
        }
    }

    public void resolveDesafio(String resposta) {
        this.resposta = resposta;
        System.out.println(resposta);
    }

    public void ajuda(String msg) {
        throw new AjudaMentorException(msg);
    }

}
