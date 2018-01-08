package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora  {

    public void somaDoisNumeros (){
        System.out.println(5+5);
    }

    public void subtraiDoisNumero () {
        System.out.println(5-5);
    }

    public void multiplicaDoisNumeros (int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public  double divideDoisNumeros(double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void  imprimeDoisNumerosDivididos (double num1, double num2){
        if(num2 != 0){
            System.out.println(num1/num2);
            return;//Se eu quiser que após a impressão, não seja executado os próximos comandos o return funciona como um break;
        }
        System.out.println("Não é possível fazer divisão por 0");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Num1:"+num1+" "+"Num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros ) {
            soma += num;/*aqui eu pego o valor de números que está na variável num e somo junto com a variável soma, implícito soma = soma + num*/
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros ) {
            soma += num;/*aqui eu pego o valor de números que está na variável num e somo junto com a variável soma, implícito soma = soma + num*/
        }
        System.out.println(soma);
    }
}

