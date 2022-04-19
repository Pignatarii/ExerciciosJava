package exercicio12;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.print("Insira o valor depositado: ");
        var inserirDeposito = entry.nextInt();
        var dias = 45;
        var deposito = new BigDecimal(inserirDeposito);
        var juros = deposito.multiply(
                new BigDecimal(dias * 0.001666), MathContext.DECIMAL32);
        var depositoJuros = deposito.add(juros);

        System.out.println("Esse é o seu rendimento: " + depositoJuros);
    }
}
