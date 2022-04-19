package exercicio1;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int notas[] = new int[4];
        var media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe uma nota: ");
            notas[i] = entry.nextInt();

            media += notas[i];
        }
        System.out.println("A media das " + notas.length + " notas é: "
                + (media / notas.length));
        if ((media / notas.length)>=6){
            System.out.println("Você está aprovado!");
        }else {
            System.out.println("Você está reprovado :(");
        }
    }
}
