package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoExercAula11 {
    public static void main(String[] args) {
        /*Crie uma variável salario e imprima seu imposto
          imposto:
          salario < 1000 5%
          salario >= 1000 && salario < 2000 10%
          salario >= 2000 && salario < 4000 15%
          salarioi > 5000 20%*/

        float salario = 5000f;
        float imposto = 0;
        float salarioComImposto;
        String valorImposto;

        if(salario < 1000){
            valorImposto = "Você recebeu 5% do seu imposto";
            imposto = salario * 0.05f;
            salarioComImposto = salario + imposto;
        }else if(salario >= 1000 && salario < 2000){
            valorImposto = "Você recebeu 10% do seu imposto";
            imposto = salario * 0.1f;
            salarioComImposto = salario + imposto;
        }else if(salario >= 2000 && salario < 4000){
            valorImposto = "Você recebeu 15% do seu imposto";
            imposto = salario * 0.15f;
            salarioComImposto = salario + imposto;
        }else {
            valorImposto = "Você recebeu 20% do seu imposto";
            imposto = salario * 0.2f;
            salarioComImposto = salario + imposto;
        }

        System.out.println(valorImposto);
        System.out.println("O total da soma de salário com imposto foi de: "+salarioComImposto);
    }
}
