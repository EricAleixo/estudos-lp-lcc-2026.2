package org.interfaces.figuras;

public class Triangulo implements FiguraGeometrica{

    private double altura;
    private double base;

    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(){
        this.altura = 0.0;
        this.base = 0.0;
    }

    public double getAltura(){
        return altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public String toString(){
        return "Triângulo de base: " +  base + " e altura: " + altura + " e área: " + calcularArea();
    }

}
