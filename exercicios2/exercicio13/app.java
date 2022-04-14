package exercicio13;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int numI, numF, primo=0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Inicio ");
        numI = entrada.nextInt();
        System.out.print("Final: ");
        numF = entrada.nextInt();

        for (int i=numI; i<=numF; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é um número primo");
            }
            primo = 0;
        }
    }
}
