package exercicio6;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] v1 = new int[10];
        float[] v2 = new float[10];
        float[] v3 = new float[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe um número: ");
            v1[i] = entry.nextInt();
        }

        System.out.println("O dobro dos números informados são: ");
        for (int j = 0; j < v1.length - 1; j++) {
            v2[j] = (v1[j] * 2);
            System.out.println(v2[j]);
        }

        System.out.println("A metade dos números informados são: ");
        for (int k = 0; k < v1.length; k++) {
            v3[k] = (v1[k] / 2);
            System.out.println(v3[k]);
        }
    }
}
