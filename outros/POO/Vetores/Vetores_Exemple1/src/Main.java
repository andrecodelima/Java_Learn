import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número de casas do vetor: ");
        int n = read.nextInt();

        double [] vect = new double[n]; // Declarando um vetor

        for(int i = 0; i < n; i++){ // Lendo um vetor
            System.out.print("Digite um número: ");
            int numero = read.nextInt();
            vect[i] = numero;
        }

        double soma = 0.0;
        for(int i= 0; i< n; i++){
            soma += vect[i];
        }

        double avg = soma/n;

        System.out.print("Average: " + avg);

    }
}

