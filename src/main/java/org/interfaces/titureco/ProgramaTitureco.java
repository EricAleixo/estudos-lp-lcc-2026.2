package org.interfaces.titureco;

import java.util.Scanner;

public class ProgramaTitureco {

    static Scanner scan = new Scanner(System.in);

    public static String input(String texto){
        System.out.print(texto);
        String input = scan.nextLine();
        return input;
    }

    public static boolean verifyString(String value,String verificador){
        return value.equals(verificador);
    }

    public static void main(String[] args){

        TiturecoList titurecoList = new TiturecoList();

        String escolha = "0";
        while (!escolha.equals("5")){
            escolha = input("Digitea opção: \n\n1 - Cadastrar Atrativo\n2 - Pesquisar atrativo da cidade\n3 - Listar todos os atrativos\n4 - Apagar atrativo\n5 - Sair\n\nDigite: ");

            if(escolha.equals("1")){
                String nomeAtrativo = input("Digite o nome do atrativo: ");

                double latitudeAtrativo = Double.parseDouble(input("Digite a latitude de " + nomeAtrativo + ": "));

                double longitudeAtrativo = Double.parseDouble(input("Digite a longitude de " + nomeAtrativo + ": "));

                String comoChegarAtrativo = input("Digite como chegar em " + nomeAtrativo + ": ");

                String cidadeAtrativo = input("Digite a cidade de " + nomeAtrativo + ": ");

                String estadoAtrativo = input("Digite o nome do estado de " + nomeAtrativo + ": ");

                String ehPraria = input("O atrativo é praia? sim ou não ");

                if(ehPraria.equals("sim")){
                    boolean propriaParaBanho = verifyString(input("É própria para banho? sim ou não\n\nOpções inválidas serão 'não'\n\nDigite: "), "sim");
                    boolean temPerigoTubarao = verifyString(input("Tem perido de tubarão? sim ou não\n\nOpções inválidas serão 'não'\n\nDigite: "), "sim");
                    String tipoOrla = input("Digite o tipo de orla: ");

                    Praia praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo, cidadeAtrativo, estadoAtrativo, propriaParaBanho, temPerigoTubarao, tipoOrla);

                    titurecoList.cadastrarAtrativo(praia);
                    System.out.println(praia.getNome() + " salvo!");
                }else{
                    AtrativoTuristico atrativo = new AtrativoTuristico(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo, cidadeAtrativo, estadoAtrativo);
                    titurecoList.cadastrarAtrativo(atrativo);
                    System.out.println(atrativo.getNome() + " salvo!");
                }

            } else if (escolha.equals("2")) {
                String cidade = input("Digite o nome da cidade: ");
                String estado = input("Digite o nome do estado: ");

                for(AtrativoTuristico a: titurecoList.pesquisarAtrativosDaCidade(cidade, estado)){
                    System.out.println(a);
                }
            } else if (escolha.equals("3")) {
                for(AtrativoTuristico a: titurecoList.getAtrativos()){
                    System.out.println(a);
                }
            } else if (escolha.equals("4")) {
                String atrativo = input("Digite o nome do atrativo: ");
                String cidade = input("Digite o nome da cidade: ");
                String estado = input("Digite o nome do estado: ");

                titurecoList.apagarAtrativo(atrativo, cidade, estado);
                System.out.println("Atrativo apagado");
            } else if (escolha.equals("5")) {
                System.out.println("Saindo do sistema!");
            } else{
                System.out.println("Opção inválida");
            }
        }
    }

}
