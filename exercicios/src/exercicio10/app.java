package exercicio11;

import javax.swing.*;
import java.math.BigDecimal;

public class app {

    public static void main(String[] Args) {

        String valorDolar = JOptionPane.showInputDialog("Informe quantos dolares você tem: ");
        String cotacaoDolarReal = JOptionPane.showInputDialog("Informe a cotação do dolar em real: ");

        var dolar = new BigDecimal(valorDolar);
        var cotacao = new BigDecimal(cotacaoDolarReal);
        var real = dolar.multiply(cotacao);

        System.out.println("Você possui " + real + " Reais");
    }
}
