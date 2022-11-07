package Menu;

import Aluno.Aluno;
import Aluno.AlunoLuta;
import Aluno.AlunoMusculacao;
import Aluno.AlunoNatacao;

import java.util.Scanner;


public class Menu {
    public static void run(){
        Aluno[] alunos;

        int quantidade = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastradps?");
        quantidade = read.nextInt();

        alunos = new Aluno[quantidade];

        for(int i = 0; i < alunos.length;i++){
            System.out.println("Cadastro: ");
            System.out.println("[1] - Luta");
            System.out.println("[2] - Musculação / Crossfit");
            System.out.println("[3] - Natação");
            int opcao = read.nextInt();

            switch (opcao){
                case 1:
                    alunos[i] = AlunoLuta.cadastra();
                    break;

                case 2:
                    alunos[i] = AlunoMusculacao.cadastra();
                    break;

                case 3:
                    alunos[i] = AlunoNatacao.cadastra();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    i--; // Cancelar a volta atual
                    break;
            }
        }
        System.out.println("===========Alunos Cadastrados==============");

        for(Aluno a : alunos){
            a.imprime();
            System.out.println("----------------------");
        }



    }
}
