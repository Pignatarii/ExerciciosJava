package exercicio9;

import javax.swing.*;
import java.util.Scanner;

public class app {
    public static void main(String[] Args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Informe a temperatura em C°: ");
        var c = entry.nextInt();
        var f = ((9 * c + 160) / 5);

        System.out.println("A temperatura em F° é: " + f);
    }
}
