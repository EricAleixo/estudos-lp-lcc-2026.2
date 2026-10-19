package org.banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
        Conta contaO = null;
        Conta contaD = null;

        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getNumeroConta().equals(numContaO) && contas.get(i).getNumeroAgencia().equals(numAgO)){
                contaO = contas.get(i);
            } else if(contas.get(i).getNumeroConta().equals(numContaD) && contas.get(i).getNumeroAgencia().equals(numAgenciaD)){
                contaD = contas.get(i);
            }
        }

        if(contaO != null && contaD != null){
            contaO.debitar(valor);
            contaD.creditar(valor);
        }

    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta conta = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
        contas.add(conta);
    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> contasNegativas = new ArrayList<>();
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i).getSaldo() < 0){
                contasNegativas.add(contas.get(i));
            }
        }
        return contasNegativas;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        // TODO: IMPLEMENTAR
        return null;
    }
}
