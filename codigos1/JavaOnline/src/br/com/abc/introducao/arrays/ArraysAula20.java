package br.com.abc.introducao.arrays;

public class ArraysAula20 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};//Já inicializa o array com as posições e valores
        int[] numeros3 = new int[]{1,2,3,4,5};//Já inicializa o array com as posições e valores

        /*for (int i = 0; i<5; i++){
            System.out.println(numeros2[i]);
        }*/

        for(int aux: numeros2){
            System.out.println(aux);
        }
    }
}
