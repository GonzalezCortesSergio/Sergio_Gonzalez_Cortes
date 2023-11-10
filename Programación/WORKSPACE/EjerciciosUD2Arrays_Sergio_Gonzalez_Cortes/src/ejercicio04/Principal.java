package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [];
		int tam= 10;
		String aux;
		double numero1;
		double numero2;
		int opcion;
		int opcionaleatorio;
		int desde= 1;
		int hasta= 99;
		int posicion;
		int diez= 10;
		
		
		numeros= new int [tam];
		
		Scanner s= new Scanner(System.in);
		Random r= new Random(System.nanoTime());
		
		System.out.println("******************************************************"
				+ "************");
		System.out.println("Bienvenido, este programa creará 10 números aleatorios"
				+ " del 1 al 99");
		System.out.println("******************************************************"
				+ "************");
		do {
			System.out.println("Pulse 1 para iniciar el programa");
			System.out.println("Pulse 0 para salir");
			
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			numero1= 0;
			numero2= 0;
			
			switch(opcion) {
			
				case 1:
					
					for (int i = 0; i < numeros.length; i++) {
						
						numeros[i]= r.nextInt((hasta-desde)+desde);
					}
					
					for (int i = 0; i < numeros.length; i++) {
						
						numero1= numeros[i];
						numero2= numero1+numero2;
						
					}
					
					do {
						System.out.println("¿Cuál número quiere ver entre el primero y el décimo?");
					
						aux= s.nextLine();
						posicion= Integer.parseInt(aux)-1;
						
						do {
							switch (posicion) {
					
								case 0:
							
									System.out.println("--------------------------------");
									System.out.printf("El primer número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								case 1:
							
									System.out.println("--------------------------------");
									System.out.printf("El segundo número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
								
								case 2:
							
									System.out.println("--------------------------------");
									System.out.printf("El tecer número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
						
								case 3:
							
									System.out.println("--------------------------------");
									System.out.printf("El cuarto número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								case 4:
							
									System.out.println("--------------------------------");
									System.out.printf("El quinto número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
								
									break;
							
								case 5:
							
									System.out.println("--------------------------------");
									System.out.printf("El sexto número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								case 6:
							
									System.out.println("--------------------------------");
									System.out.printf("El séptimo número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
								
									break;
							
								case 7:
									
									System.out.println("--------------------------------");
									System.out.printf("El octavo número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								case 8:
									
									System.out.println("--------------------------------");
									System.out.printf("El noveno número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								case 9:
									
									System.out.println("--------------------------------");
									System.out.printf("El décimo número es %d\n", numeros[posicion]);
									System.out.println("--------------------------------");
							
									break;
							
								default:
							
									System.out.println("Opción equivocada");
							
									break;
							}
						
						}while (opcion > 10);
					
						System.out.println("  ");
						System.out.println("Para mirar otro número aleatorio pulse cualquier número");
						System.out.println("Para ver la suma y media de los números aleatorios pulse 0");
						
						aux= s.nextLine();
						opcionaleatorio= Integer.parseInt(aux);
					
					
					}while(opcionaleatorio != 0);
					
					System.out.println("--------------------------------");
					System.out.printf("La suma de los números es %.2f\n", numero2);
					
					numero2= numero2/diez;
					
					System.out.printf("La media de los números es %.2f\n", numero2);
					System.out.println("--------------------------------");
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default: 
					
					System.out.println("Opción equivocada");
					
					break;
			
			}
		
		
		
		}while(opcion != 0);
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}

}
