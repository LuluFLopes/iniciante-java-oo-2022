package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class Evento {

    private String evento;

    public void criaEvento(Funcionario f, String evento) {
        this.evento = evento;
        System.out.println("O " + f.getNome() + " criou o evento " + evento);
    }

    public void ministraEvento(Mentor m) {
        System.out.println("O " + m.getNome() + " ministrou o evento de " + evento);
    }

    public void assisteEvento(Aprendiz ap) {
        System.out.println("O " + ap.getNome() + " assistiu o evento de " + evento);
    }

}
