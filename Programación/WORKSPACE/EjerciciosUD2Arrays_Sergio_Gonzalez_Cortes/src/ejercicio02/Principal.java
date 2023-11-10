package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numeros[];
		int dos= 2;
		int tam= 10;
		String aux;
		int opcion;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("**********************************************************"
				+ "***************");
		System.out.println("Bienvenido, este programa mostrará el doble de 10 números"
				+ " que introduzca");
		System.out.println("**********************************************************"
				+ "***************");
		
		numeros= new int [tam];
		
		do {
			
			System.out.println("\nPulse 1 para iniciar el programa. Pulse 0 para salir");
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
			
					System.out.println("Introduzca los 10 números");
		
					for (int i = 0; i < numeros.length; i++) {
			
						aux= s.nextLine();
						numeros[i]= Integer.parseInt(aux);
						numeros[i]= numeros[i]*dos;
					}
		
		
					for (int i = 0; i < numeros.length; i++) {
			
						System.out.print(numeros[i]);
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
