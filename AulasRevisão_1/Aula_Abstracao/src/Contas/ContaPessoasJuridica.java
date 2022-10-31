package Contas;

import Pessoas.PessoaJuridica;

public class ContaPessoasJuridica extends Conta{
    private PessoaJuridica dadosEmpresa;
    private double limiteDeCredito;
    public ContaPessoasJuridica(){}


    public ContaPessoasJuridica(String agencia, String conta, double saldo, String razaoSocial, String nomeFantasia, String cnpj) {
        super(agencia, conta, saldo);
        this.dadosEmpresa = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj);
        //Voce instancia a propriedade dadosEmpresa com a Classe Pessoa Juridica.

        this.limiteDeCredito = 1000;

    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public void saque(double valor) {
       if(super.getSaldo() + this.limiteDeCredito >= valor){
            System.out.println("\n\nSaque efetuado com sucesso!\n\n");
            super.setSaldo(super.getSaldo()-valor);
        }else{
            System.err.println("Saldo insuficiente para realizar o saque!");
        }
    }

}
