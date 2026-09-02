package org.aleixo;

import javax.swing.*;

public class Notas {

    public static void main(String[] args){

        String nota1String = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String nota2String = JOptionPane.showInputDialog("Digite a segunda nota: ");

        double nota1 = Double.parseDouble(nota1String);
        double nota2 = Double.parseDouble(nota2String);

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média é %s", media);

    }

}
