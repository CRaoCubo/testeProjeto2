package br.com.abc.javacore.introducaometodos.classes;

public class TesteTrampo {
    private String Nome  = concatenaNome();;



    private String listaAgrupamentos(){
        String Teste = "Cleverson";
        return Teste;
    }

    public String concatenaNome(){
        String nome = listaAgrupamentos() +" "+"Morais";
        return nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
