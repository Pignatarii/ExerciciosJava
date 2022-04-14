package exercicio17;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        String insertNumero = JOptionPane.showInputDialog("Digite um número");

        var recebeNumero = Integer.parseInt(insertNumero);

        if (recebeNumero >= 100 && recebeNumero <= 200) {
            System.out.println("O número " + recebeNumero + " está entre 100 e 200");
        } else {
            System.out.println("O número " + recebeNumero + " não está entre 100 e 200");
        }
    }
}
