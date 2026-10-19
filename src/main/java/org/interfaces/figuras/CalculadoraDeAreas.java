package org.interfaces.figuras;

import java.util.ArrayList;

public class CalculadoraDeAreas {

    public static void main(String[] args){
        ArrayList<FiguraGeometrica> figuras = new ArrayList < > ();

        figuras.add(new Quadrado(2));
        figuras.add(new Quadrado(7));
        figuras.add(new Quadrado(9));
        figuras.add(new Quadrado(5.7));

        figuras.add(new Triangulo(7, 5.7));
        figuras.add(new Triangulo(4.6, 3.7));
        figuras.add(new Triangulo(4, 6.7));
        figuras.add(new Triangulo(8, 8.7));


        double areaTotal = 0.0;

        for (FiguraGeometrica f: figuras){
            areaTotal += f.calcularArea();
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }

}
