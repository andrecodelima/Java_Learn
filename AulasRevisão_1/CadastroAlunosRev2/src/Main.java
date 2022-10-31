import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    static int opcao;
    static Aluno     [] regAluno = new Aluno     [2];
    static Professor [] regProf  = new Professor [2];

    static int qtdAluno;
    static int qtdProf;


    //Menu
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        while (true){

            System.out.println("\nCadastro e Consulta Escolar");
            System.out.println("Menu");
            System.out.println("Escolha uma das oções");
            System.out.println("[1] - Cadastrar  || [2] Consultar || [3] Sair");
            System.out.print("Digite Aqui: ");
            opcao = read.nextInt();

            switch (opcao){
                case 1:
                    cadastrar();
                    break;

                case 2:
                    consultar();
                    break;

                case 3:
                    System.out.println("Obrigado! Até mais");
                    System.exit(0);
                    break;


            }

        }

    }

    public static void cadastrar(){
            System.out.println("\nCadastro");
            System.out.println("");
            System.out.println("Menu");
            System.out.println("Escolha uma das oções");
            System.out.println("[1] - Alunos  || [2] Professores || [3] Sair");
            System.out.print("Digite Aqui: ");
            opcao = read.nextInt();

            switch (opcao){
                case 1:
                    Aluno.cadastroAluno(regAluno, qtdAluno); //Estudar "o static"
                    break;

                case 2:
                    Professor.cadastroProfessor(regProf, qtdProf);
                    break;

                case 3:
                    System.out.println("Obrigado! Até mais");
                    System.exit(0);
                    break;
            }

        }


    public static void consultar(){

            System.out.println("\nConsulta");
            System.out.println("");
            System.out.println("Menu");
            System.out.println("Escolha uma das oções");
            System.out.println("[1] - Alunos  || [2] Professores || [3] Sair");
            System.out.print("Digite Aqui: ");
            opcao = read.nextInt();

            switch (opcao){

                case 1:
                    consultaAlunos();
                    break;

                case 2:
                    consultaProf();
                    break;

                case 3:
                    System.out.println("Obrigado! Até mais");
                    System.exit(0);
                    break;
            }
        }



    public static void consultaAlunos(){
        if(regAluno[0] == null){
            System.out.println("Nenhum aluno cadastrado");
        }else{
            for(int c = 0; c<regAluno.length; c++){
                if (regAluno[c] == null){break;}

                System.out.println("\nConsultaAlunos");
                System.out.println("------------------------------------------");
                System.out.println("Nome: "      +regAluno[c].getNome());
                System.out.println("Gênero: "    +regAluno[c].getGenero());
                System.out.println("Telefone: "  +regAluno[c].getTelefone());
                System.out.println("Idade: "     +regAluno[c].getIdade());
                System.out.println("Turma: "     +regAluno[c].getTurma());
                System.out.println("------------------------------------------");

            }
        }
    }

    public static void consultaProf(){

    }
}
