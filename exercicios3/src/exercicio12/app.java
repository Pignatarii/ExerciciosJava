package exercicio12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class app {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número: ");
            num[i] = entry.nextInt();
        }

        int size = num.length;

        int[] listaInvertida = IntStream.range(
                0, num.length).map(i -> num[num.length - i - 1]).toArray();


        System.out.println("E a lista invertida é:");
        for (int i = 0; i < listaInvertida.length; i++) {
            System.out.println(listaInvertida[i]);
        }
    }
}
