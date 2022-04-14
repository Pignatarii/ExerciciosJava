package exercicio2;

import javax.swing.*;

public class app {

    public static void main(String[] Args){
        int num1, num2, t_soma, t_sub, t_mult, t_div;

        String msg1, msg2;

        msg1 = JOptionPane.showInputDialog("Primeiro número:");
        msg2 = JOptionPane.showInputDialog("Segundo número:");

        num1 = Integer.parseInt(msg1);
        num2 = Integer.parseInt(msg2);

        t_soma = num1 + num2;
        t_sub = num1 - num2;
        t_mult = num1 * num2;
        t_div = num1 / num2;

        System.out.println("O valor da soma é: " + t_soma);
        System.out.println("O valor da subtração é: " + t_sub);
        System.out.println("O valor da multiplicação é: " + t_mult);
        System.out.println("O valor da divisão é: " + t_div);

    }
}
