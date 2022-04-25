package exercicio2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int idade[] = new int[21];

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite um número: ");
            idade[i] = entry.nextInt();
        }
        for (int j = idade.length - 1; j >= 0; j--) {
            System.out.println(idade[j]);
        }
    }
}
