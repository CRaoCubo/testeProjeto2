package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoAula11 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        boolean ok = true;
         status = idade < 18 ? "Não adulto" : "adulto";
        //status = (ok = true) ? "Não adulto" : "adulto";
        System.out.println(status);
    }
}
