package exercicio7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] num = new int[5];
        int numN = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número: ");
            num[i] = entry.nextInt();

            if (num[i] < 0) {
                numN++;
            }
        }

        for (int i : num) {
                System.out.println("Os números informados são: " + i);
        }

        System.out.println("Dos números informados "
                + numN + " são negativos");

    }
}
