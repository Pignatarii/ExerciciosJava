package exercicio3;

import javax.swing.*;
import java.util.Scanner;

public class app {

    public static void main(String[] Args) {

        Scanner entry = new Scanner(System.in);
        int calc[] = new int[2];
        int maiorNum = 0;

        for (int i = 0; i < calc.length; i++) {
            System.out.print("Informe um número: ");
            calc[i] = entry.nextInt();

            if (maiorNum < calc[i]) {
                maiorNum = calc[i];
            }
        }
        System.out.println("O maior número é: " + maiorNum);
    }
}