package exercicio18;

import javax.swing.*;

public class app {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String n2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String n3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        var nota1 = Integer.parseInt(n1);
        var nota2 = Integer.parseInt(n2);
        var nota3 = Integer.parseInt(n3);

        var notaFinal = (nota1 * 0.6) + (nota2 * 0.2) + (nota3 * 0.2);

        if (notaFinal >= 7) {
            System.out.println("Sua nota é " + notaFinal + " Você está aprovado! :)");
        } else if (notaFinal <= 5) {
            System.out.println("Sua nota é " + notaFinal + " Você está reprovado!");
        } else if (notaFinal >= 5.1 && notaFinal <= 6.9) {
            System.out.println("Sua nota é: " + notaFinal + " Você está de recuperação :(");
        }
    }
}
