package exercicio7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String nome = "";
        var nota1 = 0;
        var nota2 = 0;
        var nota3 = 0;
        var media = 0;

        for (int i = 1; i <= 40; i++){
            Scanner entry = new Scanner(System.in);
            System.out.print("Informe seu nome: ");
            nome = entry.next();
            System.out.print("Informe a primeira nota: ");
            nota1 = entry.nextInt();
            System.out.print("Informe a segunda nota: ");
            nota2 = entry.nextInt();
            System.out.print("Informe a terceira nota: ");
            nota3 = entry.nextInt();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println("O aluno " + nome + " possui media " + media);
        }
    }
}
