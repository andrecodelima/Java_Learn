package Contas;

import Pessoas.PessoaFisica;

public class ContaPessoaFisica extends Conta{
    private PessoaFisica dadosPessoais;
    // A criação dessa propriedade é pra deixar certos dados ainda mais encapsulados.

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

    @Override
    public void saque(double valor) {
        if(valor <= super.getSaldo()){
            System.out.println("\nSaque efetuado com sucesso\n");
            super.setSaldo(super.getSaldo()-valor);

        }else{
            System.err.println("Saldo insuficiente!");
        }
    }
}
