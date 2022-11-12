package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
			válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
			possui a maior área.
			
			SOLUÇÃO APRESENTADA SEM ORIENTAÇÃO A OBJETO
		 * */
		
		 Scanner ler = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 double xA, xB, xC, yA, yB, yC;
		 System.out.println("Enter the measures of Triangule X: ");
		 xA = ler.nextDouble();
		 xB = ler.nextDouble();
		 xC = ler.nextDouble();
		 
		 System.out.println("Enter the measures of Triangule Y: ");
		 yA = ler.nextDouble();
		 yB = ler.nextDouble();
		 yC = ler.nextDouble();
		 
		 double p = (xA + xB + xC)/2.0;
		 double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		 
		 p = (yA + yB + yC)/2.0;
		 double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		 
		 System.out.println("Triangule X area: " + areaX);
		 System.out.println("Triangule Y area: " + areaY);
		 
		 if(areaX > areaY) {
			 System.out.println("Larger area X");
		 }else {
			 System.out.println("Larger area Y");
		 }
		 
		 
		 
		 
		 ler.close();
	}

}
