import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // array bidimensional (MATRIZ)
       int [][] numeros =  {

               {1,4,8,9},
               {3,2,1,7},
               {6,5,3,8},
               {2,9,4,5}
                            };

            /*
        1- imprima os números pares que estiverem dentro do array;
        2- imprima os números ímpares do array;
            */


        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
        }

        System.out.println(" ");
        // N1 - imprima os números pares que estiverem dentro do array;
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                if(numeros[i][j] % 2 == 0){
                    System.out.println("Par: " + numeros[i][j]);
                }
            }
        }

        System.out.println(" ");
        // N2- imprima os números ímpares do array;
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                if(numeros[i][j] % 2 == 1){
                    System.out.println("Impar: " + numeros[i][j]);
                }
            }
        }



    }
}