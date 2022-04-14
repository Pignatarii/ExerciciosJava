package exercicio2;

import javax.swing.*;

public class app {

    public static void main(String[] Args) {

        int num1, num2;

        String msg1, msg2;

        msg1 = JOptionPane.showInputDialog("Num1:");
        msg2 = JOptionPane.showInputDialog("Num2:");

        num1 = Integer.parseInt(msg1);
        num2 = Integer.parseInt(msg2);

        System.out.println(Math.max(num1, num2));
    }
}