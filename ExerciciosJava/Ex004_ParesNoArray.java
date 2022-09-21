
public class Ex004_ParesNoArray {

	public static void main(String[] args) {
		// PARES NO ARRAY
		// imprima os números pares que estiverem dentro do array;

		int [][] numeros = {
				
				  {1,4,8,9},
		          {3,2,1,7},
		          {6,5,3,8},
		          {2,9,4,5}
		};
		
		for(int i = 0; i<numeros.length; i++){
			for(int c = 0; c<numeros[i].length; c++){
				if(numeros[i][c] % 2 == 0){
					System.out.print(" " + numeros[i][c]);
				}
			}
		}
		
	}

}
