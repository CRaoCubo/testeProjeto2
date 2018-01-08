package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoExerc3Aula16 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 10

        int valor = 10;
        int contador = 0;
        int par = 0;

        while (contador <= valor){
            par = contador%2;
            if (par == 0) {
                System.out.println("O número: " + contador + " é par!");
            }else{
                System.out.println("O número: " + contador + " é ímpar!");
            }
            contador++;
        }

    }
}
