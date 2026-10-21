package org.interfaces.titureco;

import java.util.List;

public interface TiturecoInterface {

    boolean cadastrarAtrativo(AtrativoTuristico atrativoTuristico);
    boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado);
    List<AtrativoTuristico> getAtrativos();
    List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado);

}
