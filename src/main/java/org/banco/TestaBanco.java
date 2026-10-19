package org.banco;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Eric's Bank","123/321",new  ArrayList<Conta>());

        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
        meuBanco.abrirConta("000.2222.333-33", "456-8", "444-5", 400);

        meuBanco.transferir("222-2", "333-3", "456-8", "444-5", 70);

        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",-200);
        meuBanco.abrirConta("000.2222.333-33", "456-8", "444-5", -500);

        System.out.println(meuBanco.consultarSaldoDeConta("456-8", "444-5"));

        ArrayList<Conta> contas = meuBanco.pesquisarContasComSaldoNegativo();

        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i));
        }
    }
}

