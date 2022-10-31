package Contas;

import Pessoas.PessoaJuridica;

public class ContaPessoasJuridica extends Conta{
    private PessoaJuridica dadosEmpresa;

    public ContaPessoasJuridica(){}

    public ContaPessoasJuridica(String agencia, String conta, double saldo, String razaoSocial, String nomeFantasia, String cnpj) {
        super(agencia, conta, saldo);
        this.dadosEmpresa = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj);
    }
}
