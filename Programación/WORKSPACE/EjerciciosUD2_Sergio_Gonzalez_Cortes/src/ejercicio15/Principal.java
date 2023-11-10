package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota= 0;
		double sumanota;
		double sumasumanota = 0;
		double media;
		int seis= 6;
		int cinco= 5;
		int suspensos= 0;
		String aux;
		int tope= 6;
		int opcion;
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("**************************************************"
				+ "****************************************");
		System.out.println("Bienvenido, este programa calculará la media de 6 "
				+ "asignaturas y dirá cuántos suspensos hay");
		System.out.println("**************************************************"
				+ "****************************************");
		
		System.out.println("Si quiere calcular la media pulse cualquier número."
				+ " De querer detener el programa pulse 0");
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
		while (opcion != 0) {
			System.out.println("Pulse un número");
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			sumasumanota= 0;
			suspensos= 0;
			
			
			
		System.out.println("Introduzca las notas del alumno");
		
		for (int i = 0; i < tope; i++) {
			sumanota= sumasumanota;
			aux= s.nextLine();
			nota= Double.parseDouble(aux);
			if (nota < cinco) {
				suspensos++;
				
			}
			sumasumanota= nota+sumanota;
			
		}
		media= sumasumanota/seis;
		System.out.printf("La nota media es de %.2f\n", media);
		System.out.printf("El número de suspensos es %d\n", suspensos);
		
		}
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
