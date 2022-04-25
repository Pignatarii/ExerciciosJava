package exercicio14;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        int[] v4 = new int[10];


        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe um número: ");
            v1[i] = entry.nextInt();
            System.out.print("Informe um número: ");
            v2[i] = entry.nextInt();
        }
        for (int i = 0; i < v3.length; i++) {
            v3[i] = v1[i] * v2[i];
            System.out.println("O produto dos números informados é: " + v3[i]);
        }

        for (int i = 0; i < v4.length; i++) {
            v4[i] = v1[i] - v2[i];
            System.out.println("A subitração dos valores informados é: " + v4[i]);
        }
    }
}
