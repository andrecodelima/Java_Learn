package Aluno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlunoMusculacao extends Aluno{

    public static Aluno cadastra(){
        Aluno a = new AlunoMusculacao();
        Scanner read = new Scanner(System.in);

        System.out.print("Nome: ");
        a.setNome(read.nextLine());

        System.out.print("Idade: ");
        a.setIdade(read.nextInt());

        System.out.print("Peso: ");
        a.setPeso(read.nextDouble());

        System.out.print("Altura: ");
        a.setAltura(read.nextDouble());

        return a;

    }

    @Override
    public void imprime(){
        DecimalFormat def2Casas = new DecimalFormat("##, ###, 00");
        System.out.println("--Aluno Musculação / Crossfit --");
        super.imprime();
        System.out.println("IMC: " + def2Casas.format(super.getIMC()));

    }


}
