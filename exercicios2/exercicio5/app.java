package exercicio5;

import java.util.Scanner;

public class app {


    public static void main(String[] args) {

        var armazenaMaiorNome = "t";
        var armazenaMenorNome = "teste";
        var nome = "";
        int a1, a2, a3;

        for (int i = 1; i <= 3; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Escreva seu nome: ");
            nome = entry.next();

            a1 = nome.length();
            a2 = armazenaMaiorNome.length();
            a3 = armazenaMenorNome.length();

            if (a3 > a1) {
                armazenaMenorNome = nome;

            }else if (a2 < a1) {
                armazenaMaiorNome = nome;
            }
        }
        System.out.println("O menor nome informado é " + armazenaMenorNome +
                " e o maior nome é " + armazenaMaiorNome);
    }
}