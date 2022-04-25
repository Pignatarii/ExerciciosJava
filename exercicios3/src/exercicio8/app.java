package exercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número: ");
            num[i] = entry.nextInt();
        }

        Arrays.sort(num);
        System.out.println("Números ordenados de forma cresecente");

        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(num[i]);
        }
    }
}
