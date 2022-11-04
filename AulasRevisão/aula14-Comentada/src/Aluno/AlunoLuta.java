package Aluno;

import java.util.Scanner;

public class AlunoLuta extends Aluno{

    public static Aluno cadastra(){
        Aluno a = new AlunoLuta();
        Scanner read = new Scanner(System.in);

        System.out.print("Nome: ");
        a.setNome(read.nextLine());
        //Usando o set para inserir os dados recebidos
        // na variável da superclasse.

        System.out.print("Idade: ");
        a.setIdade(read.nextInt());

        System.out.print("Peso(Kg): ");
        a.setPeso(read.nextDouble());

        System.out.print("Altura(m): ");
        a.setPeso(read.nextDouble());

        return a;
    }

    @Override
    public void imprime(){
        System.out.println("Aluno Luta");
        super.imprime();

        if(super.getPeso()<65)
            System.out.println("Categoria: Peso Galo");
        else if(super.getPeso()<75)
            System.out.println("Categoria: Leve");
    }

}
