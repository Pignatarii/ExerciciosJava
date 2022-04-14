package exercicio15;

import javax.swing.*;
import java.math.BigDecimal;

public class app {
    public static void main(String[] args) {
        String insertValorBase = JOptionPane.showInputDialog("Insira o valor de fabrica");

        var valorBase = Integer.parseInt(insertValorBase);
        var valorFabrica = (valorBase * 0.45);
        var valorDistribuidora = ((valorBase + valorFabrica) * 0.28);
        var valorFinal = (valorBase + valorDistribuidora);
        System.out.println("O valor final do produto é: " + valorFinal);
    }
}
