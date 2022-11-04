
import java.util.Scanner;
public class Ex005_ImparesNoArray {

	public static void main(String[] args) {
		
		// IMPARES NO ARRAY
		// imprima os números ímpares do array;

		int [][] numeros = {
				
				  {1,4,8,9},
		          {3,2,1,7},
		          {6,5,3,8},
		          {2,9,4,5}
		};
		
		for(int i = 0; i<numeros.length; i++){
			for(int j = 0; j<numeros[i].length; j++){
				if(numeros[i][j] % 2 == 1){
					System.out.print(" " + numeros[i][j]);
				}
			}
		}
		
		
		
	}

}
