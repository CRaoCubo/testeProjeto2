package br.com.abc.introducao.controledefluxo;

public class ControleDeFluxoAula15  {
    public static void main(String[] args) {
        int contador = 11;
        while (contador <= 10){//Verifica se a condição é verdadeira antes de executar o bloco
            System.out.println("Posição: "+contador);
            //contador = contador + 1;
            contador++;
        }
        do{//Executa o bloco e verifica depois se a condição é veradadeira
            System.out.println("Posição: "+contador);
        }while(contador < 10);

        for(int i = 0; i<10; i++){
            System.out.println("Valor de i é: "+(i));
            if(i == 5){
                break;
            }
        }
    }
}
