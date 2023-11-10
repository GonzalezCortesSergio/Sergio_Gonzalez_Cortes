package ejemplomenu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		String aux;

		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Pulse 1 para buenos días");
		System.out.println("Pulse 2 para buenas tardes");
		System.out.println("Pulse 3 para buenas noches");
		aux= s.nextLine();
		numero1= Integer.parseInt(aux);
		
		switch(numero1) {
		
		
			case 1:
				System.out.println("Buenos días");
				System.out.println("Pulse 1 para feliz cumpleaños");
				System.out.println("Pulse 2 para feliz santo");
				System.out.println("Pulse 3 para frase genérica que sirva para darle un significado"
						+ "a tu vida insignificante");
				aux= s.nextLine();
				numero2= Integer.parseInt(aux);
				
				switch (numero2) {
				
					case 1: 
						System.out.println("Feliz cumpleaños, que disfrutes de tu día");
						
						break;
						
					case 2:
						System.out.println("Feliz santo, que tengas un buen día");
						
						break;
						
						
					case 3:
						System.out.println("MAÑA Y SABER, TODO ES MENESTER");
						
						break;
				}
				break;
				
			case 2:
				System.out.println("Buenas tardes");
				
				break;
				
			case 3:
				
				System.out.println("Buenas noches");
				
				break;
				
			default: System.out.println("Tas equivocao picha");
		
		}
		
		System.out.println("Gracias por utilizar este programa");
		
		
		
		
		
	
	}

}
