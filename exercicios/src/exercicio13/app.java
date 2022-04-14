package exercicio13;

import javax.swing.*;
import java.math.BigDecimal;

public class app {
    public static void main(String[] args) {

        String recebeValor = JOptionPane.showInputDialog("Digite o valor do produto");

        var valor = new BigDecimal(recebeValor);

        var parcelas = 5;

        var prestacoes = valor.divide(new BigDecimal(parcelas));

        System.out.println("Esse é o valor pago em cada parcela: " + prestacoes);
    }
}
