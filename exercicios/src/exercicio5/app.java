package exercicio5;

import javax.swing.*;

public class app
{

    public static void main(String[] Args)
    {
        int fuel, distance, consumo;

        String msg1, msg2;

        msg1 = JOptionPane.showInputDialog("Informe o combustivél:");
        msg2 = JOptionPane.showInputDialog("Informe a distancia:");

        fuel = Integer.parseInt(msg1);
        distance = Integer.parseInt(msg2);

        consumo = distance / fuel;

        System.out.println(consumo);
    }
}
