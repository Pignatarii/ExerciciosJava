package exercicio13;

import java.math.BigDecimal;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        var recebeValor = entry.nextInt();

        var valor = new BigDecimal(recebeValor);
        var parcelas = 5;
        var prestacoes = valor.divide(new BigDecimal(parcelas));

        System.out.println("Esse é o valor pago em cada parcela: " + prestacoes);
    }
}
