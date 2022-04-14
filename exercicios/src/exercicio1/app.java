package exercicio1;

import javax.swing.*;

public class app {

    public static void main(String[] args) {

//        int nota1, nota2, nota3, media;
//
//        String msg1, msg2, msg3;
//
//        msg1 = JOptionPane.showInputDialog("Nota 1:");
//        msg2 = JOptionPane.showInputDialog("Nota 2:");
//        msg3 = JOptionPane.showInputDialog("Nota 3:");
//
//        nota1 = Integer.parseInt(msg1);
//        nota2 = Integer.parseInt(msg2);
//        nota3 = Integer.parseInt(msg3);

        var soma = 0;

        for (int i = 1; i < 5; i++) {
            var msg = JOptionPane.showInputDialog("Nota " + i + ":");

            soma += Integer.parseInt(msg);
        }


        /**nota1 = 3;
        nota2 = 6;
        nota3 = 9;*/

        var media = soma / 3;
//        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

    }
}
