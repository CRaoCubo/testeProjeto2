package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        est.setNome("Maria");
        est.setIdade(18);
        est.setNota(new double[]{5,6});

        Estudante est1 = new Estudante();
        est1.setNome("Jão das neves");
        est1.setIdade(22);
        est1.setNota(new double[]{8,9});


        /*for (double notas: est1.getNota()) {
            System.out.println(notas);
        }*/

       /* System.out.println("Dados primeiro estudante");
        est.imprimeDados();
        est.verificaAprovacao();*/

        System.out.println();

        System.out.println("Dados segundo estudante");
        est1.imprimeDados();
        est1.verificaAprovacao();
        System.out.println(est1.isAprovado());

    }
}
