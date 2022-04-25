package exercicio13;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] v1 = new int[6];
        int[] v2 = new int[6];
        var produtoScalar = 0;

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe um número: ");
            v1[i] = entry.nextInt();
            System.out.print("Informe um número: ");
            v2[i] = entry.nextInt();
        }

        for (int i = 0; i < v1.length; i++) {
            produtoScalar += v1[i] * v2[i];
        }

        System.out.println("O produto escalar dos números informados é: " + produtoScalar);
    }
}
