package br.com.abc.introducao.controledefluxo;

/**
 *
 */

public class ControleDeFluxoAula10 {
    public static void main(String[] args) {
        int idade = 17;
        float salario = 1000;

        if (idade >= 18 && salario >= 2000) {
            System.out.println("Entra na festa!!!!");
        }else if (idade >= 18 && salario < 2000) {
            System.out.println("Sem grana não entra kkkkkk");
        }else if (idade < 18 && salario >= 2000) {
            System.out.println("De menor não entra, mesmo com grana!!!!!");
        }else {//idade < 18 && salario < 2000
            System.out.println("Maluco, além de pirralho é sem grana!!!!");
        }
    }
}
