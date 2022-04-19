package exercicio18;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int nota[] = new int[3];

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Informe uma nota: ");
            nota[i] = entry.nextInt();
        }

        var notaFinal = (nota[0] * 0.6) + (nota[1] * 0.2) + (nota[2] * 0.2);

        if (notaFinal >= 7) {
            System.out.println("Sua nota é " + notaFinal + " Você está aprovado! :)");
        } else if (notaFinal <= 5) {
            System.out.println("Sua nota é " + notaFinal + " Você está reprovado!");
        } else if (notaFinal >= 5.1 && notaFinal <= 6.9) {
            System.out.println("Sua nota é: " + notaFinal + " Você está de recuperação :(");
        }
    }
}
