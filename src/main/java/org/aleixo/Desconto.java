package org.aleixo;

import javax.swing.*;

public class Desconto {

    public static void main(String[] args){

        String valorCompraStr = JOptionPane.showInputDialog("Digite o valor da compra: ");
        double valorCompra = Double.parseDouble(valorCompraStr);

        String descontoStr = JOptionPane.showInputDialog("Digite o valor do desconto: ");
        double desconto = Double.parseDouble(descontoStr);

        double valorComDesconto = valorCompra - (valorCompra * desconto/100);

        System.out.printf("Você pagará: %s", valorComDesconto);


    }

}
