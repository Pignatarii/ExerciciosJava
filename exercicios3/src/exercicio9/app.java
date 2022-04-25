package exercicio9;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Informe o ultimos digito do ano entre os anos 2000 e 2010: ");
        var ano = entry.nextInt();

        String[] anos = {"2000", "2001", "2002", "2003", "2004", "2005",
                "2006", "2007", "2008", "2009", "2010"};

        if(ano >= 0 && ano <= 12){
            System.out.println("O número " + ano + " é referente ao mês " + anos[ano]);
        } else {
            System.out.println("Ano inválido!");
        }
    }
}
