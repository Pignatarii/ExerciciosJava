package exercicio7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int notas[] = new int[40];
        var armazenaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe uma idade: ");
            notas[i] = entry.nextInt();

            armazenaNotas += notas[i];
        }
        System.out.println("A media das notas informadas é: " + (armazenaNotas / notas.length));
    }
}
