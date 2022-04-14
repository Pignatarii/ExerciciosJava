package exercicio6;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class app
{
    public static void main(String[] Args)
    {
        BigDecimal salarioB, salarioT, valorVendas, vendas;

        String nome, salario, totalVendas;

        nome = JOptionPane.showInputDialog("Digite o seu nome");
        salario = JOptionPane.showInputDialog("Digite o seu salario");
        totalVendas = JOptionPane.showInputDialog("Digite o valor vendido:");


        salarioB = new BigDecimal(salario);
        valorVendas =  new BigDecimal(totalVendas);

        vendas = valorVendas.multiply(new BigDecimal("0.15"), MathContext.DECIMAL32);

        salarioT = (salarioB.add(vendas));

        System.out.println("O nome do vendedor é: " + nome);
        System.out.println("O Salário base do colaborador é: " + salarioB);
        System.out.println("O salárío total do colaborador é: " + salarioT);
    }
}
