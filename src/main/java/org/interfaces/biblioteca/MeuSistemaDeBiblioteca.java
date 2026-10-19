package org.interfaces.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaDeBiblioteca implements SistemaBiblioteca{

    private List<Livro> livros;

    public MeuSistemaDeBiblioteca(){
        livros = new ArrayList<>();
    }

    public void add(Livro livro) {
        livros.add(livro);
    }

    public void remove(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> all() {
        return livros;
    }
}
