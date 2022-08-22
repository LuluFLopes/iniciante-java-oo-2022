package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class Main {

    public static void main(String[] args) {

        // Funcionario f = new Funcionario(); - Não é possível instanciar classe abstrata.
        Organizador org = new Organizador("Organizador", 25);
        Mentor m = new Mentor("Mentor", 30);
        Aprendiz ap = new Aprendiz(1, "Aluno", 15, 10);
        Evento ev = new Evento();
        TiraDuvida dv = new TiraDuvida();

        ev.criaEvento(org, "palestra de orientacao a objetos em java.");
        ev.ministraEvento(m);

        // Aprendizes
        ap.aula(2, "Orientacao a objeto.");
        ap.compartilhaResultado();
        ev.assisteEvento(ap);
        /*
        A parte de trazer dúvidas é chamada pelas classe "TiraDuvida"
        */

        // Mentores 
        ev.criaEvento(m, "palestra de excecoes em java.");
        ev.ministraEvento(m);
        dv.pegaDuvidaTecnica("Nao entendi heranca muito bem, poderia me ajudar?", m);
        dv.pegaDuvidaProcesso("Quanto o movimento tem de duracao?", m);
        m.compartilhaExperiencia();
        m.criaDesafio("jogo da velha");
        m.revisaDesafio();
        m.resolveDesafio("Resposta Correta");

        //Organizadores
        // ev.ministraEvento(org); - Neste caso, os organizadores não ministram os eventos. Entretando podem criá-los.
        ev.criaEvento(org, "palestra de heranca em java.");
        ev.ministraEvento(m);
        // dv.pegaDuvidaTecnica("Oque é composicao?",org); - Limitei o organizador para que ele não tirasse as dúvidas técnias.
        dv.pegaDuvidaProcesso("Quais sao as principais regras do movimento?", org);
        org.pegaDuvidaMentor("Estou com problema com o aprendiz Fulano, oque podemos fazer?", org, m);
    }
}
