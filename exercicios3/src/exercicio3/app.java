package exercicio3;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int age[] = new int[7];
        var vetor = 0;
        var maiorIdade = 0;

        for (int i = 0; i < age.length; i++) {
            System.out.print("Informe uma idade: ");
            age[i] = entry.nextInt();

            vetor += age[i];

            if (age[i] > maiorIdade) {
                maiorIdade = age[i];
            }
        }
        System.out.println("A media das idades informadas é: " + (vetor / age.length)
                + " e a maior idade informada é: " + maiorIdade);
    }
}
