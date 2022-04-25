package exercicio15;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String[] NOM = new String[2];
        int[] N1 = new int[40];
        int[] N2 = new int[40];
        int[] N3 = new int[40];
        int[] N4 = new int[40];
        int[] M = new int[40];

        for (int i = 0; i < NOM.length; i++) {
            System.out.print("Informe seu nome: ");
            NOM[i] = entry.next();
            System.out.print("Informe a primeira nota: ");
            N1[i] = entry.nextInt();
            System.out.print("Informe a primeira nota: ");
            N2[i] = entry.nextInt();
            System.out.print("Informe a primeira nota: ");
            N3[i] = entry.nextInt();
            System.out.print("Informe a primeira nota: ");
            N4[i] = entry.nextInt();

            M[i] += (N1[i] + N2[i] + N3[i] + N4[i]) / 4;
        }

        for (int i = 0; i < NOM.length; i++) {
            System.out.println("A nota do aluno " + NOM[i] + " é: " + M[i]);

            if (M[i] >= 7 ){
                System.out.println("E o mesmo está aprovado!");
            }else {
                System.out.println("E o mesmo está reporvado!");
            }
        }
    }
}
