package exercicio9;

import javax.swing.*;

public class app {
    public static void main(String[] Args) {

        String C = JOptionPane.showInputDialog("Informe a temperatura em C°: ");

        var c = Integer.parseInt(C);
        var f = ((9 * c + 160) / 5);

        System.out.println("A temperatura em F° é: " + f);
    }
}
