package exercicio14;

import javax.swing.*;
import java.math.BigDecimal;

public class app {

    public static void main(String[] args) {
        String insertValorBase = JOptionPane.showInputDialog("Digite o valor base do produto");
        String insertPorcentual = JOptionPane.showInputDialog("Digite o porcentual a ser ganho");

        var valorBase = new BigDecimal(insertValorBase);
        var recebePorcentagem = (new BigDecimal(insertPorcentual));
        var transformPorcentual = recebePorcentagem.divide(new BigDecimal(100));
        var porcentual = valorBase.multiply(new BigDecimal(String.valueOf(transformPorcentual)));
        var valorTotal = valorBase.add(porcentual);

        System.out.println("O valor de venda é: " + valorTotal);
    }
}
