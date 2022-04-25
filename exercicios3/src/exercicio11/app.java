package exercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] v1 = new int[7];
        int[] v2 = new int[7];
        int[] vResultado = new int[7];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("informe 7 números a serem somados: ");
            v1[i] = entry.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("informe mais 7 números a serem somados: ");
            v2[i] = entry.nextInt();
        }

        for (int i = 0; i < vResultado.length; i++) {
            vResultado[i] = v1[i] + v2[i];
        }
        System.out.println("O resultado da soma dos dos arrays é: ");
        System.out.println(Arrays.toString(vResultado));
    }
}
