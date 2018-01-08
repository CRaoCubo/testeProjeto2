package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        System.out.println("Valores Classe Principal");
        System.out.println("Num1:"+num1+" "+"Num2: "+num2);

        System.out.println("--------------------------");
        System.out.println("Valores Métodos");
        calc.alteraDoisNumeros(num1, num2);
    }
}
