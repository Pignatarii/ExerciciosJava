package exercicio6;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        var nome = "";
        var salarioFixo = 0;
        float salarioFinal = 0;
        float totalVendas = 0;
        float comissao = 0;
        float armazenaComissao = 0;

        for (int i = 1; i <= 20; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Informe seu nome: ");
            nome = entry.next();
            System.out.print("Informe seu salario base: ");
            salarioFixo = entry.nextInt();
            System.out.print("Informe o seu total em vendas: ");
            totalVendas = entry.nextFloat();

            comissao = (float) (totalVendas * 0.15);
            armazenaComissao += comissao;
            salarioFinal = salarioFixo + comissao;

            System.out.println("O colaborador " + nome + " que possui o salario base de "
                    + salarioFixo + " irá receber ao todo " + salarioFinal +
                    " por conta da sua comissão de vendas");
        }
        System.out.println("O valor total pago em comissão para os colaboradores é: " +
                armazenaComissao);
    }
}
