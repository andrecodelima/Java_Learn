
public class Ex004 {

	public static void main(String[] args) {
		 int [][] numeros = 
		        {
		            {1,4,8,9},
		            {3,2,1,7},
		            {6,5,3,8},
		            {2,9,4,5}
		        };
		        
		        /*
		        1- imprima os números pares que estiverem dentro do array;
		        2- imprima os números ímpares do array;
		        3- imprima os números primos existentes entre 0 e 100; 2 diamantes
		        4- imprima os números ímpares entre 0 e 100
		        
		        --- número primo tem dois divisores naturais sendo 1 e ele mesmo ---
		        */
		 // PARES
		 for(int i = 0; i<numeros.length; i++){
			 for(int c = 0; c<numeros[i].length; c++){
				
				 if(numeros[i][c] % 2 == 0){
					 System.out.println("PAR: " + numeros[i][c]);
				 }
				 
			 }
		 }
		 System.out.println(" ");
		 //IMPARES
		 for(int i = 0; i<numeros.length; i++){
			 for(int c = 0; c<numeros[i].length; c++){
				
				 if(numeros[i][c] % 2 == 1){
					 System.out.println("IMPAR: " + numeros[i][c]);
				 }
				 
			 }
		 }
		 
	}

}
