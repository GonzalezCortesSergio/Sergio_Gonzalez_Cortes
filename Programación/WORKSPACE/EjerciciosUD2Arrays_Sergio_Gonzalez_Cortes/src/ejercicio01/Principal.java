package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		String nombres [];
		int tam= 5;
		String aux;
		int opcion;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		
		nombres= new String [tam];
		
		System.out.println("*************************************************************");
		System.out.println("Bienvenido, este programa mostrará los nombres que introduzca");
		System.out.println("*************************************************************");
		
		do {
			
		
		System.out.println("\nPulse 1 para iniciar el programa. Pulse 0 para salir");
		aux= s.nextLine();
		opcion= Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 1:
		
				System.out.println("Introduzca los nombres");
		
		
		
				for (int i = 0; i < nombres.length; i++) {
			
			
					nombres[i]= s.nextLine();
		
				}
		
		
				for (int i = 0; i < nombres.length; i++) {
			
			
					System.out.print(nombres[i]);
			
					System.out.print("  ");
			
		
				}
				
				break;
				
			case 0:
				
				System.out.println("Saliendo...");
				
				break;
				
			default:
				
				System.out.println("Opción equivocada");
				
				break;
		
		}
		
		}while (opcion != 0);
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
