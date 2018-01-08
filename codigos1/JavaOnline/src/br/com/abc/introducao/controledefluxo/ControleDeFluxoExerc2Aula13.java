package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoExerc2Aula13 {
    public static void main(String[] args) {
        //Crie um Switch que dado um valor de 1 a 7
        //Considerando 1 para domingo imprima se é dia útil ou final de semana

        byte dia = 4;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semanda");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor digitado não se refere a um dia da semana");
                break;
        }
    }
}
