package exercicio4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int[] num = new int[15];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = entry.nextInt();
        }
        for (int j = num.length - 1; j >= 0; j--) {
            System.out.println(num[j]);
        }
    }
}
