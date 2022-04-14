package exercicio9;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        var num = 0;
        boolean isPrimo = true;

        Scanner entry = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = entry.nextInt();

        for (int i = 2; i <= num; i++) {
            if ( ( (num % i) == 0) && (i != num) ) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo) {
            System.out.println( "é Primo" );
        } else {
            System.out.println("O número " + num + " não é Primo");
        }
    }
}