package exercicio20;

import javax.swing.*;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Informe seu nome");
        String insertNome = entry.next();
        System.out.print("Informe seu sexo");
        String insertSexo = entry.next();


        System.out.println("Informe seu idade");
        Integer idade = entry.nextInt();
        System.out.println("Informe seu salario");
        Integer recebeSalario = entry.nextInt();

        var salario = 0;

        if (idade >= 18 && idade <= 30 && insertSexo.equals("m") && recebeSalario >= 800
                && recebeSalario <= 1120) {
            salario = (int) ((recebeSalario * 0.07) + recebeSalario);

            System.out.println("O colaborador " + insertNome + " terá o salario reajustado para "
                    + salario);

        } else if (idade >= 31 && idade <= 50 && insertSexo.equals("m")) {
            salario = (int) ((recebeSalario * 0.09) + recebeSalario);

            System.out.println("O colaborador " + insertNome + " terá o salario reajustado para "
                    + salario);

        } else if (idade >= 51 && insertSexo.equals("m")) {
            salario = (int) ((recebeSalario * 0.115) + recebeSalario);

            System.out.println("O colaborador " + insertNome + " terá o salario reajustado para "
                    + salario);

        } else if (idade >= 18 && idade <= 30 && insertSexo.equals("f") && recebeSalario >= 800
                && recebeSalario <= 1050) {
            salario = (int) (recebeSalario * 0.075);

            System.out.println("A colaboradora " + insertNome + " terá o salario reajustado para "
                    + salario);

        } else if (idade >= 31 && insertSexo.equals("f")) {
            salario = (int) ((recebeSalario * 0.116) + recebeSalario);

            System.out.println("A colaboradora  " + insertNome + " terá o salario reajustado para "
                    + salario);
        }
    }
}
