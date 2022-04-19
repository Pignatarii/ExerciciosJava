package exercicio5;

import javax.swing.*;
import java.util.Scanner;

public class app {

    public static void main(String[] Args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Informe a quantidade de combustivel gasto: ");
        float fuel = entry.nextInt();
        System.out.println("Informe a distancia percorrida: ");
        float distance = entry.nextInt();

        System.out.println("O consumo médio de combustivel é:  "
                + (fuel / distance));
    }
}
