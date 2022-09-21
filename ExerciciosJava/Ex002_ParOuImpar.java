
import java.util.Scanner;

public class Ex002_ParOuImpar {

	public static void main(String[] args) {
		// PAR OU IMPAR
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		System.out.print("Digite um número: ");

		Scanner leia = new Scanner(System.in);
		int x = leia.nextInt();
		
		
		if(x % 2 == 0 ){
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}

	}

}
