package ejercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double sueldofijo= 1000;
		double porcentaje;
		double veinte= 20;
		double porciento= 100;
		double vendido;
		double salario;
		int opcion;
		String aux;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("******************************************************"
				+ "**************************");
		System.out.println("Bienvenido, este programa calculará su salario mensual"
				+ " en función de sus ventas.");
		System.out.println("******************************************************"
				+ "**************************");
		System.out.println("  ");
		
		System.out.println("Pulse 1 para que empiece el programa");
		System.out.println("Pulse 0 para salir");
		
		
		do {
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("Introduzca lo que ha ganado en ventas");
					aux= s.nextLine();
					vendido= Double.parseDouble(aux);
					
					porcentaje= veinte/porciento;
					
					vendido= vendido-(vendido*porcentaje);
					
					salario= sueldofijo+vendido;
					
					System.out.printf("Usted obtiene un salario de %.2f€\n", salario);
					
					break;
					
				case 0:
					
					System.out.println("--------------------------------");
					System.out.println("Gracias por utilizar el programa");
					System.out.println("--------------------------------");
					
					break;
			}
			
		} while (opcion != 0);
	}

}
