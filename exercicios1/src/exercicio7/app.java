package exercicio7;

import java.util.Scanner;

public class app {

    public static void main(String[] Args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var nome = entry.next();
        System.out.print("Digite a primeira nota: ");
        var nota1 = entry.nextInt();
        System.out.print("Digite a segunda nota: ");
        var nota2 = entry.nextInt();
        System.out.print("Digite a terceira nota: ");
        var nota3 = entry.nextInt();

        var notaFinal = (nota1 * 0.6) + (nota2 * 0.2) + (nota3 * 0.2);
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("E a nota final do mesmo é: " + notaFinal);
    }
}
