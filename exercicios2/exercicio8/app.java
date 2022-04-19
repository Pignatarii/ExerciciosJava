package exercicio8;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        var insertNumero = 0;
        var guardaPar = 0;

        for (int i = 1; i <= 10; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Informe um número: ");
            insertNumero = entry.nextInt();

            if (insertNumero % 2 == 0) {
                guardaPar += insertNumero;
            }
        }
        if (guardaPar == 0){
            System.out.println("Nenhum dos número informados é par :(");
        }else {
            System.out.println("Dos 10 números informados, a soma dos número pares é: "
                    + guardaPar);
        }
    }
}
