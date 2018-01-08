package br.com.abc.introducao.arrays;

public class ArraysAula18 {
    public static void main(String[] args) {
        int[] idades = new int[3];

        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 50;

        for (int i = 0; i<3; i++){
            System.out.println("Idade na posição "+i+": "+idades[i]);
        }
    }
}
