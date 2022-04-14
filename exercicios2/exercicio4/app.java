package exercicio4;

import javax.swing.*;

public class app {



    public static void main(String[] args) {

        String recebeNum1 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum2 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum3 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum4 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum5 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum6 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum7 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum8 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum9 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum10 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum11 = JOptionPane.showInputDialog("Informe o número");
        String recebeNum12 = JOptionPane.showInputDialog("Informe o número");

        var num1 = Integer.parseInt(recebeNum1);
        var num2 = Integer.parseInt(recebeNum2);
        var num3 = Integer.parseInt(recebeNum3);
        var num4 = Integer.parseInt(recebeNum4);
        var num5 = Integer.parseInt(recebeNum5);
        var num6 = Integer.parseInt(recebeNum6);
        var num7 = Integer.parseInt(recebeNum7);
        var num8 = Integer.parseInt(recebeNum8);
        var num9 = Integer.parseInt(recebeNum9);
        var num10 = Integer.parseInt(recebeNum10);
        var num11 = Integer.parseInt(recebeNum11);
        var num12 = Integer.parseInt(recebeNum12);

        Object[] pessoas =
                {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12};

        var soma = 0;

        for (int i = 0; i < pessoas.length; i++) {
                soma += (Integer) pessoas[i];
        }
        int resultado = soma / pessoas.length;

        System.out.println(resultado);
    }
}

