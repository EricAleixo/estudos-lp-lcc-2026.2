package org.interfaces.biblioteca;

import java.util.List;

public interface SistemaBiblioteca {

    void add(Livro livro);
    void remove(Livro livro);
    List<Livro> all();

}
