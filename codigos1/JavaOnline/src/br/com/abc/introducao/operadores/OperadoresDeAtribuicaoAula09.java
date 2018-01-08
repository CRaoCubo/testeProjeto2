package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicaoAula09 {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        /*Forma convencional de somar*/
        // salario = salario + 1000;
        /*Outra forma de somar*/
        //salario += 1000; //Isso diz que é para somar o que já tem de salario + 1000 e atribuir a variável salário
        salario = salario + (int) (salario * 0.1);//Foi usado um cast para converter o valor double da multiplicação para int

        System.out.println(salario);
    }
}
