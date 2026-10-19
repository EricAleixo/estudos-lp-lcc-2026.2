package org.interfaces.sons;

import java.util.ArrayList;

public class CaixaDeSom {

    private ArrayList<EmissorDeSom> emissores;

    public CaixaDeSom(){
        emissores = new ArrayList<>();
    }

    public void adicionarEmissor(EmissorDeSom e){
        emissores.add(e);
    }

    public ArrayList<EmissorDeSom> getEmissores(){
        return emissores;
    }

    public void tocarTodosOsEmissores(){
        for(EmissorDeSom e : emissores){
            System.out.println(e.emitirSom());
        }
    }

}
