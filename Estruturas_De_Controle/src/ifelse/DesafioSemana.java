package ifelse;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
		System.out.println("DESAFIO DIA DA SEMANA");
		Scanner sc =  new Scanner(System.in);
				
		System.out.print("Escreva um dia da semana: ");
		String dia = sc.nextLine();
	
		if(dia.equalsIgnoreCase( "domingo")) {
			System.out.print(1);
		
		}else if(dia.equalsIgnoreCase("segunda")) {
			
			System.out.print(2);
		
		}else if(dia.equalsIgnoreCase("terça")) {
			
			System.out.print(3);
		
		}else if(dia.equalsIgnoreCase("quarta")) {
			
			System.out.print(4);
		
		}else if(dia.equalsIgnoreCase("quinta")) {
			
			System.out.print(5);

		}else if(dia.equalsIgnoreCase("sexta")) {
			
			System.out.print(6);

		}else if(dia.equalsIgnoreCase("sabado")) {
			
			System.out.print(7);

		}else {
			
			System.out.print("Opção inválida!");

		}
	
	

}
}