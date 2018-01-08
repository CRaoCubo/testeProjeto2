package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumero();
        calc.multiplicaDoisNumeros(3,2);
        //System.out.println(calc.divideDoisNumeros(6,2));
        double resultado = calc.divideDoisNumeros(6,2);
        System.out.println(resultado);
        System.out.println("----------------------------------------------");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("----------------------------------------------");
        int[] numeros = new int[] {1,2,3,4,5};

        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
