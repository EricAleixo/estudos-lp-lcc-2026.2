package org.interfaces.figuras;

public class Quadrado implements FiguraGeometrica{

    private double lado;

    public Quadrado(){
        this.lado = 0.0;
    }

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public String toString(){
        return "Quadrado de lado: " + lado + " e área: " + calcularArea();
    }

}
