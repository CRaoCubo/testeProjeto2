package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor[] professores = new Professor[2];

        professores[0] = new Professor();
        professores[0].nome = "Ana";
        professores[0].matricula = 123456f;
        professores[0].rg = "121212";
        professores[0].cpf = "000.333.222-99";

        professores[1] = new Professor();
        professores[1].nome = "Cleverson";
        professores[1].matricula = 654321f;
        professores[1].rg = "131313";
        professores[1].cpf = "020.343.522-99";

        for (int i = 0; i < 2; i++){
            System.out.println("Professor: "+professores[i].nome+" Matricula: "+professores[i].matricula+" RG: "+professores[i].rg+
                                " CPF: "+professores[i].cpf);
        }

    }
}
