package exercicio10;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String[] nomes = new String[10];
        var maiorNome = "";
        var posicao = 0;


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe um nome: ");
            nomes[i] = entry.next();
        }
        for (int i = 0; i < nomes.length; i++) {
            var nomeTamanho = 0;
            var comparador = 0;

            nomeTamanho = nomes[i].length();
            comparador = maiorNome.length();


            if (nomeTamanho > comparador) {
                maiorNome = nomes[i];
                posicao = i;
            }
        }
        System.out.println("O maior nome é: " + maiorNome);
        System.out.println("E a posição do nome no array é: " + posicao);
    }
}
