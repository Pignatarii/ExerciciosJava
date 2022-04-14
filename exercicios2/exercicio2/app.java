package exercicio2;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        String recebeNum1 = JOptionPane.showInputDialog("Digite o primeiro número que seja maior que dez");
        String recebeNum2 = JOptionPane.showInputDialog("Digite um outro número");

        var num1 = Integer.parseInt(recebeNum1);
        var num2 = Integer.parseInt(recebeNum2);

        if (num1 <= 10){
            System.out.println("O número informado é menor que 10 :(");
            System.exit(0);
        }else {
            System.out.println("O número informado é: "+ num1);
        }
        if (num2 == num1){
            System.out.println("O número " + " informado é igual ao primeiro número.");
        }else {
            System.out.println("O número informado é: "+ num2);
        }
    }
}

