package com.mycompany.main;

/**
 *
 * @author lucme
 */
public class TiraDuvida {

    private Aprendiz ap;

    public TiraDuvida() {
        ap = new Aprendiz();
    }

    /*
    A idéia foi utilizar o tratamento das excessoes em comparação com as dúvidas que são tiradas dos alunos.
    Também usei as duas formas de excecoes que aprendemos para exemplificar.
     */
    
    // Checked
    public void pegaDuvidaTecnica(String msg, Mentor m) {
        try {
            ap.duvidaTecnica(msg);
        } catch (DuvidaTecnicaException ex) {
            System.out.println("Duvida esclarecida por " + m.getNome() + "!");
            ap.setExperiencia(ap.getExperiencia() + 1);
        }
    }

    //Uncheked
    public void pegaDuvidaProcesso(String msg, Organizador org) {
        try {
            ap.duvidaProcesso(msg);
        } catch (DuvidaProcessoException ex) {
            System.out.println("Duvida esclarecida por " + org.getNome() + "!");
            ap.setExperiencia(ap.getExperiencia() + 1);
        }
    }
    
    

}
