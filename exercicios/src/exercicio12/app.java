package exercicio12;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class app {
    public static void main(String[] args) {

        String inserirDeposito = JOptionPane.showInputDialog("Insira o valor depositado");
//      String diasJuros = JOptionPane.showInputDialog("Insira a quantidade de dias trabalhados");

//      var dias = new BigDecimal(diasJuros);

        var dias = 45;

        var deposito = new BigDecimal(inserirDeposito);

        var juros = deposito.multiply(new BigDecimal(dias * 0.001666), MathContext.DECIMAL32);

        var depositoJuros = deposito.add(juros);

        System.out.println("Esse é o seu rendimento: " + depositoJuros);
    }
}
