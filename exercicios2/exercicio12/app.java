package exercicio12;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        var mediaAltura = 0;
        var maiorAltura = 0;
        var menorAltura = 10000;

        System.out.print("Informe o número da quantidade de alunos na sala: ");
        int altura[] = new int[entry.nextInt()];

        for (int i = 0; i < altura.length; i++) {
            System.out.print("Informe uma altura: ");
            altura[i] = entry.nextInt();

            mediaAltura += altura[i];

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.println("A sala possui " + altura.length + " alunos!");
        System.out.println("A media de altura da sala é: "
                + (mediaAltura / altura.length) + " , a maior altura informada é: "
                + maiorAltura + " e a menor altura informada é: " + menorAltura);
    }
}
