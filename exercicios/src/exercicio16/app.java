package exercicio16;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        String insertNum1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String insertNum2 = JOptionPane.showInputDialog("Digite o segundo número");
        String insertNum3 = JOptionPane.showInputDialog("Digite o terceiro número");

        var num1 = Integer.parseInt(insertNum1);
        var num2 = Integer.parseInt(insertNum2);
        var num3 = Integer.parseInt(insertNum3);

        var maiorNumP1 = (Math.max(num1, num2));
        var maiorNumP2 = (Math.max(maiorNumP1, num3));
        System.out.println("O maior número é o: "+ maiorNumP2);

        var menorNumP1 = (Math.min(num1, num2));
        var menorNumP2 = (Math.min(menorNumP1, num3));
        System.out.println("O menor número é o: "+ menorNumP2);
    }
}
