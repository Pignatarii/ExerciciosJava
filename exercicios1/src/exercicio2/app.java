package exercicio2;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int calc[] = new int[2];
        int soma = 0;

        for (int i = 0; i < calc.length; i++) {
            System.out.print("Informe um número: ");
            calc[i] = entry.nextInt();

            soma += calc[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
