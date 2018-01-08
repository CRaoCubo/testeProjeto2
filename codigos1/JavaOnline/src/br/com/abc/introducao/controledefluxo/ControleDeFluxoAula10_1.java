package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoAula10_1 {
    public static void main(String[] args) {
        /*idade < 15 categoria infantil
          idade >= 15 && idade < 18 categoria juvenil
          idade >=18 adulto*/
        int idade = 17;
        String categoria;

        if (idade < 15){
            categoria = "Infatil!!";
        }else if (idade >= 15 && idade < 18 ){
            categoria = "juvenil!!";
        }else { //idade >= 18
            categoria = "adulto!!";
        }

        System.out.println("Sua categoria é: "+categoria);

        /*Report de como pode dar erro:
          Uma variável local sempre que declarada ela deve estar inicializada, no nosso código se tirar-mos alguma condição
          a categoria não é inicializada,por que a mesma é inicializada em cada if, se faltar um ai irá apresentar um
          erro de compilação.*/
    }
}
