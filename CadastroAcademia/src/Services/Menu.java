package Services;

import java.util.Scanner;
import PessoaTipo.Aluno;

public class Menu {
    static Scanner read = new Scanner(System.in);
    static int opcao;
    CadastroAluno cadastro = new CadastroAluno();
    static Aluno [] regAluno = new Aluno [3];
    static int qtd;

    public void menu(){

        while (true){
            System.out.println("\nACADEMIA PRO + SYSTEM \n");
            System.out.println("Escolha uma das opções abaixo.");
            System.out.println("[1] - Cadastro ** [2] Consulta ** [3] Sair \n");
            System.out.print("Digite Aqui: ");
            opcao = read.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("ÁREA DE CADASTRO\n");
                    cadastro.cadastroAluno(regAluno, qtd++);

                    break;

                case 2:
                    System.out.println("ÁREA DE CONSULTA\n");
                    consulta();
                    break;

                case 3:
                    System.exit(0);

            }

        }
    }

    public static void consulta(){
            if(regAluno[0]==null) {
                System.out.println("Nenhum registro encontrado");
            }else{
                for(int c = 0; c<regAluno.length; c++){
                    if(regAluno[c] == null){break;}

                    else{
                        System.out.println("Nome:   "    + regAluno[c].getNome());
                        System.out.println("Idade:  "    + regAluno[c].getIdade());
                        System.out.println("Altura: "    + regAluno[c].getAltura());
                        System.out.println("Peso:   "    + regAluno[c].getPeso());
                        System.out.println("Turma:  "    + regAluno[c].getTurma());


                    }

                    }
                }
            }

}


