package exercicio3;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        var nome = "";
        var idade = 0;
        var guardaIdadeM = 0;
        var contadorM = 0;
        var idadeM = 0;
        float contadorF = 0;
        float porcentagemF = 0;
        var sexo = "";

        for (int i = 1; i <= 6; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Escreva seu nome: ");
            nome = entry.next();
            System.out.print("Informe sua idade: ");
            idade = entry.nextInt();
            System.out.print("Informe seu sexo (F) ou (M): ");
            sexo = entry.next();

            if (sexo.equals("M") || sexo.equals("m")) {
                guardaIdadeM += idade;
                ++contadorM;
            } else if (sexo.equals("F") || sexo.equals("f")) {
                ++contadorF;
            }
        }
        idadeM = guardaIdadeM / contadorM;
        porcentagemF = (contadorF / 6) * 100;
        System.out.println("A porcentagem de mulhers informadas é " + porcentagemF + "%");
        System.out.println("A idade média dos homens informados é: " + idadeM);
    }
}