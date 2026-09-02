package org.aleixo;

import javax.swing.*;

public class Imc {

    public static void main(String[] args){

        String pesoString = JOptionPane.showInputDialog("Digite seu peso: ");
        double peso = Double.parseDouble(pesoString);

        String alturaSting = JOptionPane.showInputDialog("Digite sua altura: ");
        double altura = Double.parseDouble(alturaSting);

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu imc é " + imc);

    }

}
