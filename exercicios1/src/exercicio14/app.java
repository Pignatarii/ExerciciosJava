package exercicio14;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o valor base do produto: ");
        var insertValorBase = entry.nextInt();
        System.out.print("Digite o porcentual a ser ganho: ");
        var insertPorcentual = entry.nextFloat();

        float recebePorcentual = insertPorcentual / 100;
        float porcentual = insertValorBase * recebePorcentual;

        System.out.println("O valor de venda é: " + (insertValorBase + porcentual));
    }
}
