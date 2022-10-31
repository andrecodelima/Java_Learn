
import java.util.Scanner;
public class Professor extends Pessoa{
    private String turno;

    public Professor(){}

    public Professor(String nome, String genero, String telefone, int idade, String turno) {
        super(nome, genero, telefone, idade);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // cadastrar Professor

    public static void cadastroProfessor(Professor [] arrayProf, int qtd){
        System.out.println("Cadastro de Professores");
        Scanner read = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Gênero: ");
        String genero = read.next();

        System.out.print("Telefone: ");
        String tel = read.next();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("Turno: ");
        String turno = read.next();

        arrayProf[qtd] = new Professor(nome, genero, tel, idade, turno);
        qtd++;


    }
}
