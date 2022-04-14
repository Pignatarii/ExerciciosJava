package exercicio20;

import javax.swing.*;
import java.math.BigDecimal;

public class app {
    public static void main(String[] args) {

        String insertNome = JOptionPane.showInputDialog("Informe seu nome");
        String insertSexo = JOptionPane.showInputDialog("Informe seu sexo");
        String insertSalario = JOptionPane.showInputDialog("Informe seu salario");
        String insertIdade = JOptionPane.showInputDialog("Informe seu idade");

        var idade = Integer.parseInt(insertIdade);
        var recebeSalario = Integer.parseInt(insertSalario);
        var salario = 0;

        if (idade >= 18 && idade <= 30 && insertSexo.equals("m") && recebeSalario >= 800
                && recebeSalario <= 1120) {
              salario = (int) ((recebeSalario * 0.07) + recebeSalario);

            System.out.println("O colaborador " + insertNome + " terá o salario reajustado para "
                    + salario);

        }
        else if (idade >= 31 && idade <= 50 && insertSexo.equals("m")){
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
//        }else {
//            System.out.println("Os dados estão incorretos");
        }
    }
}