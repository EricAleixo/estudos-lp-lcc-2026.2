package org.interfaces.sons;

public class TesteCaixaDeSom {

    public static void main(String[] args){

        CaixaDeSom caixaDeSom = new CaixaDeSom();

        caixaDeSom.adicionarEmissor(new Cachorro("Alfred"));
        caixaDeSom.adicionarEmissor(new Tambor("M", "TORELLI"));
        caixaDeSom.adicionarEmissor(new Cachorro("Bob"));
        caixaDeSom.adicionarEmissor(new Tambor("P", "HERTZ"));
        caixaDeSom.adicionarEmissor(new Cachorro("Milton"));

        caixaDeSom.tocarTodosOsEmissores();

    }

}
