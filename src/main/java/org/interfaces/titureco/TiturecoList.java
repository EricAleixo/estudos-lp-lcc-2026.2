package org.interfaces.titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{

    private List<AtrativoTuristico> atrativos;

    public TiturecoList(){
        atrativos = new ArrayList<>();
    }


    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativoTuristico) {
        return atrativos.add(atrativoTuristico);
    }

    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        for(AtrativoTuristico atrativo: atrativos){
            if(atrativo.getNome().equals(nomeAtrativo) &&
            atrativo.getCidade().equals(cidade) &&
            atrativo.getEstado().equals(estado)){
                return atrativos.remove(atrativo);
            }
        }

        return false;
    }

    @Override
    public List<AtrativoTuristico> getAtrativos() {
        return atrativos;
    }

    @Override
    public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> atrativosTuristicos = new ArrayList<>();
        for(AtrativoTuristico atrativo: atrativos){
            if(atrativo.getCidade().equals(cidade)
                    && atrativo.getEstado().equals(estado)){
                atrativosTuristicos.add(atrativo);
            }
        }

        return atrativosTuristicos;
    }
}
