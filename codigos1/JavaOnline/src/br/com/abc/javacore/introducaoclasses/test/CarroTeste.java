package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "OOQ0772";
        carro.velocidadeMaxima = 120f;

        System.out.println("Modelo: "+carro.modelo+" Placa: "+carro.placa+" Velocidade Máxima: "+carro.velocidadeMaxima);

    }

}
