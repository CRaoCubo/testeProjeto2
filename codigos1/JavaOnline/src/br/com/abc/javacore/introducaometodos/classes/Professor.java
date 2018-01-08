package br.com.abc.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public float matricula;
    public String rg;
    public String cpf;

 /*   public void imprimeProfessores(Professor prof){
        System.out.println("Nome: "+prof.nome);
        System.out.println("Matricula: "+prof.matricula);
        System.out.println("RG: "+prof.rg);
        System.out.println("CPF: "+prof.cpf);*/

    public void imprimeProfessores(){
     System.out.println("Nome: "+this.nome);
     System.out.println("Matricula: "+this.matricula);
     System.out.println("RG: "+this.rg);
     System.out.println("CPF: "+this.cpf);

    }

}
