package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Program {

	public static void main(String[] args) {
		 
		/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
			válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
			possui a maior área.
			
			SOLUÇÃO APRESENTADA COM A CRIAÇÃO DE CLASSES (SEM MÉTODOS)
		 * */
		
		 Scanner ler = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 Triangule x, y;
		 x = new Triangule();
		 y = new Triangule();
		 
		 
		 System.out.println("Enter the measures of Triangule X: ");
		 x.a = ler.nextDouble();
		 x.b = ler.nextDouble();
		 x.c = ler.nextDouble();
		 
		 
		 System.out.println("Enter the measures of Triangule Y: ");
		 y.a = ler.nextDouble();
		 y.b = ler.nextDouble();
		 y.c = ler.nextDouble();
		 
		 double p = (x.a + x.b + x.c)/2.0;
		 double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		 
		 p = (y.a + y.b + y.c)/2.0;
		 double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		 
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
