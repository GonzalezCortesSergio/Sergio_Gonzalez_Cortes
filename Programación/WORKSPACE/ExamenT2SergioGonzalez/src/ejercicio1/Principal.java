package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		int numeros[] ;
		int tiradas= 10;
		String aux;
		int desde= 1;
		int hasta;
		int guardarnum;
		double sumarnum;
		double porcentaje;
		int cien= 3100;
		double media;
		String tirada= ("Tirada");
		int menor5;
		double max;
		int min;
		int sumaadicional;
		int opcion;
		int posicion;
		int opciontirada;
		
		//INSERTAR SCANNER Y RANDOM
		Scanner s= new Scanner(System.in);
		Random r= new Random(System.nanoTime());
		
		//INICIALIZAR ARRAY
		numeros= new int [tiradas];
		
		System.out.println("******************************************************************"
				+ "*************************************************************");
		System.out.println("Bienvenido, este programa realizará una serie de tiradas de dados."
				+ " Podrá realizar distintas acciones respecto a dichas tiradas.");
		System.out.println("******************************************************************"
				+ "*************************************************************");
		
		
		System.out.println("Introduzca de cuántas caras quiere que sea el dado");
		aux= s.nextLine();
		hasta= Integer.parseInt(aux);
		
		System.out.println("Pulse una de las opciones");
		do {
			
			System.out.println("""
				
				---------------------------------------------------------------	
					Opción 0:	Salir
				
					Opción 1:	Generar 10 tiradas
				
					Opción 2:	Total puntos tiradas
				
					Opción 3:	Media numérica de las tiradas
				
					Opción 4:	Número de tiradas de valor menor que 5
				
					Opción 5:	Porcentaje de máximos obtenidos
				
					Opción 6:	Resultado tiradas
				
					Opción 7:	Tirada más baja
				
					Opción 8:	Sumar valor a tirada
				---------------------------------------------------------------
				
					""");
			
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				case 1:
					
					do {
					
					for (int i = 0; i < numeros.length; i++) {
						
						numeros[i]= r.nextInt(hasta-desde+1)+desde;
					}
					
					System.out.println("Si quiere realizar otra tirada pulse cualquier número. Si no, pulse 0");
					aux= s.nextLine();
					opciontirada= Integer.parseInt(aux);
						
					}while(opciontirada != 0); 
					
					break;
					
				case 2:
					guardarnum= 0;
					sumarnum= 0;
					
					for (int i = 0; i < numeros.length; i++) {
						
						guardarnum= numeros[i];
						sumarnum= sumarnum+guardarnum;
						
					}
					
					System.out.printf("El total de puntos es %.0f\n", sumarnum);
					
					break;
					
				case 3:
					
					guardarnum= 0;
					sumarnum= 0;
					
					for (int i = 0; i < numeros.length; i++) {
						
						guardarnum= numeros[i];
						sumarnum= sumarnum+guardarnum;
						
					}
					
					sumarnum= sumarnum/tiradas;
					
					System.out.printf("La media de puntos es %.2f\n", sumarnum);
					
					break;
					
				case 4:
					
					menor5= 0;
					for (int i = 0; i < numeros.length; i++) {
						
						
						
						if (numeros[i] < 5) {
							
							menor5++;
						}
						
						
					}
					
					System.out.printf("Han salido %d valores menores que 5\n", menor5);
					
					break;
					
				case 5:
					
					max= 0;
					
					for (int i = 0; i < numeros.length; i++) {
						
						if (numeros[i] == hasta) {
							
							max++;
							
						}
						
					}
						max= max/tiradas;
						
						porcentaje= max*100;
						
						System.out.println("Le ha salido el valor máximo un "+ porcentaje + "% de veces");
						
						break;
						
					
				case 6:
					
					for (int i = 0; i < numeros.length; i++) {
						
						System.out.printf("%s %d\t", tirada, i+1);
						
					}
					
					System.out.println(" ");
					System.out.println("--------------------------------------------------------------------------------------------------------------"
							+ "---------------------------------------------");
					
					for (int i = 0; i < numeros.length; i++) {
						
						
						System.out.printf("%d\t\t", numeros[i]);
					}
					
					System.out.println(" ");
					System.out.println("--------------------------------------------------------------------------------------------------------------"
							+ "---------------------------------------------");
					
					break;
					
				case 7:
					
					min= 0;
					
					for (int i = 0; i < numeros.length; i++) {
						
						if (min == 0) {
							
							min= numeros[i];
						}
						
						else if(min > numeros[i]) {
							
							min= numeros[i];
						}
						
					}
					
					System.out.println("La tirada más baja es de "+min);
					
					break;
					
				case 8:
					
					System.out.println("Seleccione la tirada que quiere sumar (ej: Para sumar la tirada 1, seleccionar 1)");
					
					aux= s.nextLine();
					posicion= Integer.parseInt(aux)-1;
					
					System.out.println("¿Cuánto le quiere sumar? (números positivos)");
					aux= s.nextLine();
					sumaadicional= Integer.parseInt(aux);
					
					numeros[posicion]= numeros[posicion]+sumaadicional;
					
					System.out.println("El número ha aumentado a "+numeros[posicion]);
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
					
			}
			
		}while (opcion != 0);
		
		
		System.out.println("  ");
		System.out.println("********************************");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("********************************");
	}

}
