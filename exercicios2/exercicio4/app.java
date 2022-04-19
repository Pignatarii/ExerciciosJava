package exercicio4;

import javax.swing.*;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int num[] = new int[7];
        var maiorIdade = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número: ");
            num[i] = entry.nextInt();

            if (num[i] > maiorIdade) {
                maiorIdade = num[i];
            }
        }
        System.out.println("A media das idades informadas é: " + maiorIdade);
    }
}

