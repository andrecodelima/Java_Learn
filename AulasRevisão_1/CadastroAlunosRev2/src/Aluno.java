
import java.util.Scanner;
public class Aluno extends Pessoa{

    private String turma;

    public Aluno(){}

    public Aluno(String nome, String genero, String telefone, int idade, String turma) {
        super(nome, genero, telefone, idade);
        this.turma = turma;
    }


    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    // cadastrar aluno
    public static void cadastroAluno(Aluno [] arrayAluno, int qtd){
        System.out.println("Cadastro de Alunos");
        Scanner read = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Gênero: ");
        String genero = read.next();

        System.out.print("Telefone: ");
        String tel = read.next();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("Turma: ");
        String turma = read.next();

        arrayAluno[qtd] = new Aluno(nome, genero, tel, idade, turma);
        qtd++;

    }


}
