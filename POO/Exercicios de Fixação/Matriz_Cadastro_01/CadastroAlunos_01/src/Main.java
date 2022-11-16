import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Dever de casa:
         * cadastre um array de notas de alunos.
         * guarde cada aluno em uma linha do array:
         * cada aluno deverá ter 4 notas;
         * cadastre 4 alunos e, ao final do cadastro, exiba:
         * as notas dos alunos e a média das notas.
         *
         * --EXTRA- Diga se está aprovado ou reprovado sabendo: de 0 à 5 reprovado, de 5 à 7 recuperação
         * e de 7 pra cima está aprovado!
         * */

        Locale.setDefault(Locale.US);
        System.out.print("Informe quantos alunos serão cadastrados: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [][] vect = new double[n][2];

        double soma = 0;
        double media = 0;

        for(int i = 0; i<vect.length; i++){
            System.out.print("ID Aluno: " + (i)+1);
            System.out.println(" ");

            for(int j = 0; j<vect[i].length; j++){
                System.out.print("Nota: ");
                vect[i][j] = sc.nextDouble();
                soma = soma + vect[i][j];

            }
        }









    }
}