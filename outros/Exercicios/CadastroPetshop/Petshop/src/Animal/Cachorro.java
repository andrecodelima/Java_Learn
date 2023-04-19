package Animal;

import java.util.Scanner;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }


    public static Animal cadastro(){
        Animal pet = new Cachorro();


        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        pet.setNome(sc.next());

        System.out.print("Raça: ");


        return pet;

    }

}
