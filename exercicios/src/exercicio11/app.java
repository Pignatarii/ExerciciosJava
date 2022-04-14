package exercicio11;

import javax.swing.*;

public class app {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        String num2 = JOptionPane.showInputDialog("Digite o segundo valor");
        String num3 = JOptionPane.showInputDialog("Digite o terceiro valor");

        var n1 = Integer.parseInt(num1);
        var n2 = Integer.parseInt(num2);
        var n3 = Integer.parseInt(num3);

        var maior1 = (Math.max(n1, n2));
        var maior2 = (Math.max(maior1, n3));

        System.out.println("O maior número dentre os informados é: " + maior2);
    }
}
