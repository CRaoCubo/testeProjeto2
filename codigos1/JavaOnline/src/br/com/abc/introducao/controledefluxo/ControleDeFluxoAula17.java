package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoAula17 {
    public static void main(String[] args) {

        int parcelas = 0;
        int auxParcelas = 0;
        float valorCarro = 3000;
        float valorParcela = 0;
        float auxValorParcela = 0;
        float valorMinimoParcela = 1000;

        do {
            parcelas++;
            valorParcela = valorCarro / parcelas;
            if (valorParcela >= valorMinimoParcela) {
                auxParcelas++;
                auxValorParcela = valorParcela;
                System.out.println("O carro pode ser dividido em: " + auxParcelas + "X de R$" + auxValorParcela);
            } else {
                break;
            }
        } while (valorParcela >= valorMinimoParcela);

    }
}

