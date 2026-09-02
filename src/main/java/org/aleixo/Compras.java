package org.aleixo;

import javax.swing.*;

public class Compras {

    public static void main(String[] args){

        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de maças: "));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade mamões: "));

        double valorParaPagar = quantMacas * 1 + quantMamoes * 3.50;

        JOptionPane.showMessageDialog(null, "Você pagará: " + valorParaPagar);
    }

}
