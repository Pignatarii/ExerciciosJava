package exercicio10;

import java.math.BigDecimal;
import java.util.Scanner;

public class app {

    public static void main(String[] Args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Informe quantos dolares você tem: ");
        var dolar = new BigDecimal(entry.nextInt());
        System.out.println("Informe a cotação do dolar em real: ");
        var cotacao = new BigDecimal(entry.nextInt());
        var real = dolar.multiply(cotacao);

        System.out.println("Você possui " + real + " Reais");
    }
}
