package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int edad;
		int dias= 365;
		int edaddias;
		String aux;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("///////////////////////////////////////"
				+ "//////////////////////////////");
		System.out.println("Bienvenido, introduzca su edad en años "
				+ "y el programa lo pasará a días");
		System.out.println("///////////////////////////////////////"
				+ "//////////////////////////////");
		
		aux= s.nextLine();
		edad= Integer.parseInt(aux);
		
		edaddias= edad*dias;
		
		System.out.printf("Su edad en días es %d\n", edaddias);
		System.out.println("***************************************"
				+ "******************************");
		System.out.println("Gracias por utilizar el programa");
	}

}
