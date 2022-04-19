package exercicio6;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class app
{
    public static void main(String[] Args)
    {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        var nome = entry.next();
        System.out.print("Digite o seu salario: ");
        var salarioB = new BigDecimal(entry.nextInt());
        System.out.print("Digite o valor vendido: ");
        var valorVendas =  new BigDecimal(entry.nextInt());

        var vendas = valorVendas.multiply(new BigDecimal
                ("0.15"), MathContext.DECIMAL32);

        var salarioT = (salarioB.add(vendas));

        System.out.println("O nome do vendedor é: " + nome);
        System.out.println("O Salário base do colaborador é: " + salarioB);
        System.out.println("O salárío total do colaborador é: " + salarioT);
    }
}
