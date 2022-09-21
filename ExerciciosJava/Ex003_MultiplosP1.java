
import java.util.Scanner;
public class Ex003_MultiplosP1 {

	public static void main(String[] args) {
		/*
			Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
			Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
			ordem crescente ou decrescente.
		
		
		 * Os múltiplos são os resultados das multiplicações entre dois números inteiros. 
		 * Assim, a partir de um número inteiro, ao multiplicá-lo por outros, obtém-se o conjunto de seus múltiplos.

			Exemplo
			12 x 3 = 36
			36 é múltiplo tanto do 12 quanto do 3, pois é o resultado da multiplicação entre eles.
		
		 	Como identificar múltiplo
		 	Para se certificar que um número a é múltiplo de um número b, basta dividir a por b. 
		 	Se o resultado for exato, sem sobrar resto, a é múltiplo de b.
		 	
		 */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int A = leia.nextInt();

		System.out.print("Digite outro número: ");
		int B = leia.nextInt();

		if(A % B == 0 || B % A == 0) {
			System.out.print(A + " , " + B + " São multiplos");
		}else {
			System.out.println(A + " , " + B + " Não são multiplos");
		}
		
			
	}

}
