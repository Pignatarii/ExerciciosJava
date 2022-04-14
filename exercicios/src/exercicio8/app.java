package exercicio8;

import javax.swing.*;

public class app {

    public static void main(String[] Args){

        String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        int a = Integer.parseInt(num1), b = Integer.parseInt(num2);
        a = returnFirst(b, b = a);
        System.out.println("O primeiro número invertido é: " + a + " E o segundo número invertido é: " + b);
    }

    private static int returnFirst(int b, int i) {
        return b;
    }
}
