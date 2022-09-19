import java.util.Scanner;


public class Ex001 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		System.out.print("Digite um número: ");
		
		Scanner leia = new Scanner(System.in);
		int num = leia.nextInt();
		
		if(num < 0) {
			System.out.println("Inteiro Negativo");
		}else {
			System.out.println("Inteiro Positivo");
		}
		

	}

}
