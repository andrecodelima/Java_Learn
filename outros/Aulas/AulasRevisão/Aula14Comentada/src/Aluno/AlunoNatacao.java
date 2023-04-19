package Aluno;

import java.util.Scanner;

public class AlunoNatacao extends Aluno {
    public static Aluno cadastra(){
        Aluno a = new AlunoNatacao();
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Idade: ");
        a.setIdade(leia.nextInt());

        System.out.print("Peso(KG): ");
        a.setPeso(leia.nextDouble());

        System.out.print("Altura(m): ");
        a.setAltura(leia.nextDouble());

        return a;
    }

    @Override
    public void imprime(){
        System.out.println("--Aluno Natação--");
        super.imprime();
        System.out.println("Piscina: " + (super.getIdade() >= 18? "1" : "2" ));


    }

}
