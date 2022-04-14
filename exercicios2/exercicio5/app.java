package exercicio5;

import java.util.Scanner;

public class app {


    public static void main(String[] args) {

        var menorNome = "";
        var maiorNome = "";
        var armazenaMaiorNome = "";
        var armazenaMenorNome = "";
        var nome = "";
        int a1, a2, a3;

        Scanner entry1 = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        nome = entry1.next();

        a1 = nome.length();
        a2 = armazenaMaiorNome.length();
        a3 = armazenaMenorNome.length();

        for (int i = 1; i <= 2; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Escreva seu nome: ");
            nome = entry.next();

            armazenaMaiorNome = nome;
            armazenaMenorNome = nome;

//            a1 = nome.length();
//            a2 = armazenaMaiorNome.length();
//            a3 = armazenaMenorNome.length();

            System.out.println(a3);

            if (a1 < a3) {
                armazenaMenorNome = nome;

            }else if (a1 > a2) {
                armazenaMaiorNome = nome;
            }
        }
        System.out.println("O menor nome informado é: " + armazenaMenorNome +
                " e o maior nome é: " + armazenaMaiorNome);
    }
}