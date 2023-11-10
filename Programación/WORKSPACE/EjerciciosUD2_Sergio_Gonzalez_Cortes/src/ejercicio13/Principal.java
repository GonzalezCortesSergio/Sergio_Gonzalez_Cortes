package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero;
		String aux;
		int diez= 10;
		int multiplicacion= 0;
		int resultado = 0;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("**********************************************************"
				+ "********************");
		System.out.println("Bienvenido, este programa te dirá la tabla de multiplicar "
				+ "de un número entero.");
		System.out.println("**********************************************************"
				+ "********************");
		System.out.println("Introduzca un número. Cero para acabar");
		
		do {
			
			
			aux= s.nextLine();
			numero= Integer.parseInt(aux);
			multiplicacion= 0;
			resultado= 0;
			while (resultado < numero*diez) {
				
				resultado= numero*multiplicacion;
				System.out.printf("%d x %d = %d\n", numero, multiplicacion, resultado);
				multiplicacion++;
				
			}
			
		} while (numero != 0);
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
		
	}

}
