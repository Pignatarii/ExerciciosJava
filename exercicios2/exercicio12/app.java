package exercicio12;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        var altura = 0;
        var alturaAlunos = 0;

        Scanner alunosSalaE = new Scanner(System.in);
        System.out.print("Informe o número da quantidade de alunos na sala: ");
        var alunosSala = alunosSalaE.nextInt();

        for (int i = 1; i <= alunosSala; i++) {
            for (int j = 1; j <= i; j++) {
                Scanner alturaAlunosE = new Scanner(System.in);
                System.out.print("Informe a altura do aluno:  ");
                alturaAlunos = alturaAlunosE.nextInt();
            }
        }
        altura = (alturaAlunos + alturaAlunos) / alunosSala;
        System.out.println("A altura média da sala que possui " + alunosSala + " é " + altura);
    }
}
