package exercicio11;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int maior[] = new int[3];
        var maiorNum = 0;

        for (int i = 0; i < maior.length; i++) {
            System.out.print("Informe um número: ");
            maior[i] = entry.nextInt();

            if (maior[i] > maiorNum) {
                maiorNum = maior[i];
            }
        }
        System.out.println("O maior número é: " + maiorNum);
    }
}
