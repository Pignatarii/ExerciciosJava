package exercicio16;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int num[] = new int[3];
        var maiorNum = 0;
        var menorNum = 1000000000;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = entry.nextInt();

            if (num[i] > maiorNum) {
                maiorNum = num[i];
            }
            if (num[i] < menorNum) {
                menorNum = num[i];
            }
        }
        System.out.println("O maior numero é: " + maiorNum);
        System.out.println("O menor numero é: " + menorNum);
    }
}
