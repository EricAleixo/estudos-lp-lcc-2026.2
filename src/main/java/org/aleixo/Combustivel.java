package org.aleixo;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Combustivel {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantAlcool = 0;
        int quantGasolina = 0;
        int quantDiesel = 0;

        int escolha = 0;

        while(escolha != 4){
            escolha = Integer.parseInt(scanner.nextLine());

            if(escolha == 1){
                quantAlcool++;
            }else if(escolha == 2){
                quantGasolina++;
            }else if(escolha == 3){
                quantDiesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Diesel: " + quantDiesel);

    }

}