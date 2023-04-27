package main;

public class Main {

	public static void main(String[] args) {
		 
		String a = "";
		int tam = a.length();

		for(tam++; tam<6; tam++) {
			a+="#";
			System.out.println(a);
		}
		
		//Sem valor númerico para controle.
		for(String v = "#"; !v.equals("######"); v +="#") {
			System.out.println(v);
		}
	}

}
