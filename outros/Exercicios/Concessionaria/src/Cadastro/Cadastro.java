package Cadastro;
import Veiculo.Carro;
import Veiculo.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void menu(){
        ArrayList<Veiculo> array = new ArrayList<Veiculo>();
        int qtd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nº de Cadastros: ");
        qtd = sc.nextInt();

        array = new ArrayList<>(qtd);

        for(int i = 0; i<=array.size(); i++){

            array.add(i, Carro.cadastro());
            i++;
        }

        for(Veiculo a : array){
            a.exibe();
        }


    }

}
