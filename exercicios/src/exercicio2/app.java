package exercicio2;

import javax.swing.*;

public class app {

    public static void main(String[] args){

        int num1, num2, total;
        String msg1, msg2;

        msg1 = JOptionPane.showInputDialog("Nota 1:");
        msg2 = JOptionPane.showInputDialog("Nota 2:");

        num1= Integer.parseInt(msg1);
        num2= Integer.parseInt(msg2);

        total = num1 + num2;

        System.out.println("O total é: " + total);
    }
}
