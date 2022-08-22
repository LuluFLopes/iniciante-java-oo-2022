package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class Organizador extends Funcionario {

    public Organizador() {

    }

    public Organizador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Checked
    public void pegaDuvidaMentor(String msg, Organizador org, Mentor m) {
        try {
            m.ajuda(msg);
        } catch (AjudaMentorException ex) {
            System.out.println("Ajuda oferecida por " + org.getNome() + "!");
        }
    }

}
