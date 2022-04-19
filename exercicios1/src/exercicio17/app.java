package exercicio17;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var recebeNumero = entry.nextInt();

        if (recebeNumero >= 100 && recebeNumero <= 200) {
            System.out.println("O número " + recebeNumero + " está entre 100 e 200");
        } else {
            System.out.println("O número " + recebeNumero + " não está entre 100 e 200");
        }
    }
}
