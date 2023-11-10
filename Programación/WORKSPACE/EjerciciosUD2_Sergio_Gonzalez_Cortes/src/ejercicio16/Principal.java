package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario;
		double salarioextra;
		double horas;
		int horasnec= 40;
		double pago= 16;
		double pagoextra= 20;
		int opcion;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("**********************************************"
				+ "***********************************");
		System.out.println("Bienvenido, este programa calculará su salario"
				+ " en función de sus horas trabajadas");
		System.out.println("**********************************************"
				+ "***********************************");
		System.out.println("Para calcular su salario pulse 1, para salir, pulse 0");
		
		do {
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("Introduzca sus horas trabajadas");
					aux= s.nextLine();
					horas= Double.parseDouble(aux);
					
					if (horas <= horasnec) {
						
						salario= pago*horas;
						
						System.out.printf("Le corresponde un salario de %.2f€\n", salario);
					}
					
					else {
						
						horas= horas-horasnec;
						
						salario= pago*horasnec;
						salarioextra= pagoextra*horas;
						
						salario= salario+salarioextra;
						
						System.out.printf("Le corresponde un salario de %.2f€\n", salario);
						
					}
					
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
