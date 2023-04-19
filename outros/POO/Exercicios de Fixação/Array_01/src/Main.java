import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação simples de um array

        int [] vect = new int [10];
        // int - tipo do array
        // [] - Declaração do array
        // vect - nome do array
        // new int [] - instanciação do array
        // [10] - Definição das posições do array



        // Adicionando dados no array
        // Usado o for para percorrer (iterar) o array com a variável i
        // que foi usada como índice para cada posição do array.

        for(int i = 0; i<vect.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("|" + (i+1) + "|" +  " Numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println(" ");


        // Impressão do conteúdo do array
        // Usado o for para percorrer (iterar) o array com a variável i
        // que foi usada como índice para cada posição do array.

        for(int i = 0; i<vect.length; i++){
            System.out.print(" " + vect[i]);
        }


    }
}