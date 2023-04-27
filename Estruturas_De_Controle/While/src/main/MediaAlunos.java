package main;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		
		System.out.println("Challenge - Average \n");
		Scanner rd = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		
		double avg;
		int cont = 0;
				
		while(nota != -1) {
			System.out.print("Digite um número válido: ");
			nota = rd.nextDouble();
			
			cont++;
			total = total + nota;
			
			System.out.print("Digite um número válido: ");
			nota = rd.nextDouble();
			
		}
		
		avg = (total)/cont;
		
		System.out.println("\nFIM! \n");
		System.out.print("Avarage: " + avg);
		
		
	}

}
