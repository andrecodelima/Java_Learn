package Contas;

import Pessoas.PessoaFisica;

public class ContaPessoaFisica extends Conta{
    private PessoaFisica dadosPessoais;

    public ContaPessoaFisica() {
    }

    public ContaPessoaFisica(String agencia, String conta, double saldo, String nome, String cpf, String genero) {
        super(agencia, conta, saldo);
        this.dadosPessoais = new PessoaFisica(nome, cpf, genero);


    }

    public PessoaFisica getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(PessoaFisica dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }


}
