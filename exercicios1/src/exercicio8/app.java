package exercicio8;

import javax.swing.*;
import java.util.Scanner;

public class app {

    public static void main(String[] Args) {

        Scanner entry = new Scanner(System.in);
        int inverter[] = new int[2];

        for (int i = 0; i < inverter.length; i++) {
            System.out.print("Informe um número: ");
            inverter[i] = entry.nextInt();
        }
        for (int j = inverter.length - 1; j >= 0; j--) {
            System.out.println("Número invertido: " + inverter[j]);
        }
    }
}
