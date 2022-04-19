package exercicio19;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Informe o número do mês: ");
        var mes = entry.nextInt();

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("O número " + mes + " é referente ao mês " + meses[mes - 1]);
    }
}
