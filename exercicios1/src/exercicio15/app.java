package exercicio15;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Insira o valor de fabrica: ");
        var valorBase = entry.nextInt();

        var valorFabrica = (valorBase * 0.45);
        var valorDistribuidora = ((valorBase + valorFabrica) * 0.28);
        var valorFinal = (valorBase + valorDistribuidora);
        System.out.println("O valor final do produto é: " + valorFinal);
    }
}
