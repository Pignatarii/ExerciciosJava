package exercicio10;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        float valorDoProduto;
        float cotacaoDolar;
        float valorDolar;
        float armazenaValorFinal = 10000000;

        Scanner entry = new Scanner(System.in);
        System.out.print("Informe a cotação do dolar: ");
        cotacaoDolar = entry.nextInt();

        for (int i = 1; i <= 2; i++) {

            System.out.print("Informe o valor do produto em real: ");
            valorDoProduto = entry.nextInt();


            valorDolar = valorDoProduto / cotacaoDolar;

            if(valorDolar < armazenaValorFinal ){
                armazenaValorFinal = valorDolar;
                System.out.println("recebeu");
            }
        }

        System.out.println("O valor mais baixo pago em dolar é:  " + armazenaValorFinal);
    }
}
