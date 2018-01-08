package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double nota[] = new double[2];
    private boolean aprovado;


    public void imprimeDados (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void verificaAprovacao (){
        double media = 0;
        for (double notas: this.nota) {
            media += notas; //está recebendo media + notas
        }

        media = media/ nota.length;

        if(media > 6) {
            aprovado = true;
            System.out.println("Situacao: Aprovado");
          //  System.out.println(this.aprovado);
        }else {
            System.out.println("Situacao:  Reprovado");
         //   System.out.println(this.aprovado);
        }
    }

     public void setNome(String nome){
        this.nome = nome;
     }

     public String getNome(){
        return this.nome;
    }

     public void setIdade(int idade){
         this.idade = idade;
     }

     public int getIdade(){
        return this.idade;
    }

     public void setNota(double[] nota){
         this.nota = nota;
     }

     public double[] getNota(){
         return this.nota;
     }

     public boolean isAprovado(){
         return this.aprovado;
     }

}
