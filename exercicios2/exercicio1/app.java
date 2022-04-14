package exercicio1;

import javax.swing.*;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        var num = 0;

        Scanner numE = new Scanner(System.in);


            System.out.print("Informe a primeira nota!: ");
            var nota1 = numE.nextInt();

            System.out.print("Informe a segunda nota!: ");
            var nota2 = numE.nextInt();

            System.out.print("Informe a terceira nota!: ");
            var nota3 = numE.nextInt();

            System.out.print("Informe a quarta nota!: ");
            var nota4 = numE.nextInt();

            var media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A media das quatro notas é " + media);

            if (media >= 6) {
                System.out.println("Aprovado");
            } else if (media < 6) {
                System.out.println("Reprovado");
            }
    }
}
