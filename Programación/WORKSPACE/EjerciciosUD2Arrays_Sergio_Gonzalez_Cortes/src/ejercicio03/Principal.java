package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [];
		int tam= 8;
		String aux;
		int ceros;
		int numero;
		double numero2;
		
		int opcion;
		
		numeros= new int [tam];
		Scanner s= new Scanner(System.in);
		
		System.out.println("******************************************************************************"
				+ "****************************************");
		System.out.println("Bienvenido, este programa hará la media de los 8 números que haya introducido."
				+ " Además que contará los 0 que introduzca.");
		System.out.println("******************************************************************************"
				+ "****************************************");
		
		do {
			System.out.println("--------------------------------");
			System.out.println("Pulse 1 para iniciar el programa");
			System.out.println("Pulse 0 para salir");
			System.out.println("--------------------------------");
			
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					numero= 0;
					numero2= 0;
					ceros= 0;
					
					System.out.println("Introduzca 8 números");
					
					for (int i = 0; i < numeros.length; i++) {
					
						aux= s.nextLine();
						numeros[i]= Integer.parseInt(aux);
						if (numeros[i] == 0) {
						
							ceros++;
						}
					
					}
				
					for (int i = 0; i < numeros.length; i++) {
					
						numero= numeros[i];
						numero2= numero + numero2;
						
						
					}
				
					numero2= numero2/tam;
				
					System.out.printf("La media es de %.2f. Número de ceros %d \n", numero2, ceros);
					
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
