package org.interfaces.titureco;

import java.util.Objects;

public class AtrativoTuristico {

    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado){
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    public AtrativoTuristico(){
        this("", 0.0, 0.0, "", "", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void settLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComoChegar() {
        return comoChegar;
    }

    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        AtrativoTuristico that = (AtrativoTuristico) object;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0 && Objects.equals(nome, that.nome) && Objects.equals(comoChegar, that.comoChegar) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, latitude, longitude, comoChegar, cidade, estado);
    }


    @Override
    public String toString() {
        return "Atrativo Turístico\n" +
                "Nome: " + nome + "\n" +
                "Localização: " + cidade + " - " + estado + "\n" +
                "Coordenadas: " + latitude + ", " + longitude + "\n" +
                "Como chegar: " + comoChegar;
    }

}
