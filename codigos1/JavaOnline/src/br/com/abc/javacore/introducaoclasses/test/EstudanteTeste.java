package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante[] aluno = new Estudante[3];

        aluno[0] = new Estudante();
        aluno[0].nome = "Cleverson";
        aluno[0].matricula = "2222";
        aluno[0].idade = 22;

        aluno[1] = new Estudante();
        aluno[1].nome = "Marina";
        aluno[1].matricula = "3333";
        aluno[1].idade = 26;

        aluno[2] = new Estudante();
        aluno[2].nome = "Karina";
        aluno[2].matricula = "4444";
        aluno[2].idade = 18;

        for(int i = 0; i < 3; i++){
            System.out.println("Nome: "+aluno[i].nome+" - Matrícula: "+aluno[i].matricula+" - Idade: "+aluno[i].idade);
        }



    }
}
