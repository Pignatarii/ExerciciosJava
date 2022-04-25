package exercicio5;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

         int[] v1 = new int[8];
         int[] v2 = new int[8];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe um número: ");
            v1[i] = entry.nextInt();
        }
        for (int j = v1.length -1; j >= 0; j--) {
            v2[j] += v1[j];
            System.out.println(v2[j]);
        }
    }
}
