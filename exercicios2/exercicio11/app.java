package exercicio11;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String recebeSenha = "";

        for (int i = 1; i <= 3; i++) {
            Scanner entry = new Scanner(System.in);
            System.out.print("Digite a senha correta: ");
            recebeSenha = entry.next();

            if (recebeSenha.equals("xingling123")) {
                System.out.println("Login efetuado com sucesso");
            } else if (i == 3) {
                System.out.println("login bloqueado");
                break;
            }
        }
    }
}
