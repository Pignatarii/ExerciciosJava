package exercicio1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int numbers[] = new int[10];
        var armazenaValorFinal = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Informe um número: ");
            numbers[i] = entry.nextInt();
            armazenaValorFinal += numbers[i];
        }
        System.out.println("O valor final da soma é: " + armazenaValorFinal);
    }
}
