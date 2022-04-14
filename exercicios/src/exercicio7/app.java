package exercicio7;

import javax.swing.*;

public class app {

    public static void main(String[] Args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String n1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String n2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String n3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        var nota1 = Integer.parseInt(n1);
        var nota2 = Integer.parseInt(n2);
        var nota3 = Integer.parseInt(n3);

        var notaFinal = (nota1 * 0.6) + (nota2 * 0.2) + (nota3 * 0.2);
        System.out.println("E a nota final do mesmo é: " + notaFinal);
        System.out.println("O nome do aluno é: " + nome);
    }
}
