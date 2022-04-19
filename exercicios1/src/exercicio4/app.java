package exercicio4;

import javax.swing.*;
import java.util.Scanner;

public class app {

    public static void main(String[] Args){

        Scanner entry = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        var num1 = entry.nextInt();
        System.out.print("Informe o segundo número: ");
        var num2 = entry.nextInt();

        var t_soma = num1 + num2;
        var t_sub = num1 - num2;
        var t_mult = num1 * num2;
        var t_div = num1 / num2;

        System.out.println("O valor da soma é: " + t_soma);
        System.out.println("O valor da subtração é: " + t_sub);
        System.out.println("O valor da multiplicação é: " + t_mult);
        System.out.println("O valor da divisão é: " + t_div);

    }
}
