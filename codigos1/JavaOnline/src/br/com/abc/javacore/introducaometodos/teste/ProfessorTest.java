package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "838.876.333-00";
        prof.matricula = 1234343;
        prof.nome = "Maria";
        prof.rg = "121233";

       // prof.imprimeProfessores(prof);
        prof.imprimeProfessores();
    }
}
