package org.aleixo;

import javax.swing.*;

public class Apresentacao {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Qual é seu nome? ");
        String city = JOptionPane.showInputDialog("Qual a cidade em que você nasceu? ");

        JOptionPane.showMessageDialog(null, "Oi, "+ name + "! Que legal saber que você é da cidade " + city + ".");

    }

}
