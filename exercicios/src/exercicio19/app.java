package exercicio19;

import javax.swing.*;

public class app {

    public static void main(String[] args) {

        String insertMes = JOptionPane.showInputDialog("Digite o número do mês");
        var mes = Integer.parseInt(insertMes);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("O número " + mes + " é referente ao mês " + meses[mes]);
    }
}
