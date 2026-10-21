package org.interfaces.titureco;

import java.util.Objects;

public class Praia extends AtrativoTuristico{

    public String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;


    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado
    , boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla){
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }

    public Praia(){
        super();
        this.propriaParaBanho = false;
        this.perigoTubarao = false;
        this.tipoOrla = "";
    }

    public boolean ehPropriaParaBanho(){
        return propriaParaBanho;
    }

    public boolean temPerigoTubarao(){
        return perigoTubarao;
    }

    public String getTipoOrla() {
        return tipoOrla;
    }

    public void setTipoOrla(String tipoOrla) {
        this.tipoOrla = tipoOrla;
    }

    public void setPerigoTubarao(boolean temPerigo){
        this.perigoTubarao = temPerigo;
    }

    public void setPropriaParaBanho(boolean ehPropria){
        this.propriaParaBanho = ehPropria;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Praia praia = (Praia) object;
        return propriaParaBanho == praia.propriaParaBanho && perigoTubarao == praia.perigoTubarao && Objects.equals(TIPO_PISCINAS_NATURAIS, praia.TIPO_PISCINAS_NATURAIS) && Objects.equals(TIPO_ONDAS_FORTES, praia.TIPO_ONDAS_FORTES) && Objects.equals(TIPO_ONDAS_MEDIAS, praia.TIPO_ONDAS_MEDIAS) && Objects.equals(tipoOrla, praia.tipoOrla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), TIPO_PISCINAS_NATURAIS, TIPO_ONDAS_FORTES, TIPO_ONDAS_MEDIAS, propriaParaBanho, perigoTubarao, tipoOrla);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Tipo de atrativo: Praia\n" +
                "Própria para banho: " + (propriaParaBanho ? "Sim" : "Não") + "\n" +
                "Perigo de tubarão: " + (perigoTubarao ? "Sim" : "Não") + "\n" +
                "Tipo de orla: " + tipoOrla;
    }

}
