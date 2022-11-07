package Aluno;

import java.util.Scanner;
public class AlunoLuta extends Aluno{

    public static Aluno cadastra(){
        //Criação de um método do Tipo "Aluno".
        // Observe que não é um método void e cujo tipo é a classe.

        Aluno a = new AlunoLuta();
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        a.setNome(leia.nextLine());
        //Usamos o set para inserir os valores nas propriedades
        // (variaveis) da classe pai.

        System.out.print("Informe a idade: ");
        a.setIdade(leia.nextInt());

        System.out.print("Informe o Peso: ");
        a.setPeso(leia.nextDouble());

        System.out.print("Informe a Altura: ");
        a.setAltura(leia.nextDouble());

        return a;

    }

@Override
    public void imprime(){
    System.out.println("---Luta---");
    super.imprime(); //Importa o método da classe Pai.

    // Modificando o método.

    if(super.getPeso() < 65){
        System.out.println("Categoria:  Peso Galo");
    }

    else if (super.getPeso() <75) {
        System.out.println("Categoria:  Peso Leve");
    }

    else if(super.getPeso() < 85){
        System.out.println("Categoria:  Peso Médio");
    }

    else{
        System.out.println("Categoria:  Peso Pesado");
    }
}

}
