package br.com.abc.introducao.arrays;

public class ArraysAula21 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        System.out.println(dias.length);

//        for (int i = 0; i < dias.length; i++){
//            for (int j = 0; j < dias[i].length; j++){
//                System.out.println("Array na posição "+i+" "+j+": "+dias[i][j]);
//            }
//        }

        for(int[] ref : dias){
            for (int dia : ref){
                System.out.println(dia);
            }
        }
    }
}
