package Main;

import Contas.ContaPessoaFisica;
import Contas.ContaPessoasJuridica;

public class Main {
    public static void main(String[] args) {
        ContaPessoaFisica contaPF = new ContaPessoaFisica("0001", "2121",100,"Leo","121121","M");
        ContaPessoasJuridica contaPJ = new ContaPessoasJuridica("0022","1212",20, "nevesconstrutora","casaneves","212120001-12");

        System.out.println("Agencia: " + contaPF.getAgencia());
        System.out.println("Conta: " + contaPF.getConta());
        System.out.println("Saldo: " + contaPF.getSaldo());
        System.out.println("Nome: "  + contaPF.getDadosPessoais().getNome());
        System.out.println("CPF: "  + contaPF.getDadosPessoais().getCpf());
        System.out.println("Gênero: " + contaPF.getDadosPessoais().getGenero());

        contaPF.saque(10);
        contaPJ.saque(2000);
    }
}
