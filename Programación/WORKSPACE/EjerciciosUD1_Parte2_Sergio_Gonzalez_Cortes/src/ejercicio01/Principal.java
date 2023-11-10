package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		String nombre;
		int entero;
		double real;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("////////////////////////////////////////////////");
		System.out.println("Bienvenido, vamos a probar distintas variables");
		System.out.println("////////////////////////////////////////////////");
		System.out.println("Escriba una variable string (por ejemplo su nombre)");
		nombre= s.nextLine();
		System.out.printf("Su variable string es: %s\n", nombre);
		System.out.println("Ahora una variable int (un número entero)");
		aux= s.nextLine();
		entero= Integer.parseInt(aux);
		System.out.printf("Su variable int es: %d\n", entero);
		System.out.println("Escriba una variable double (un número real)");
		aux= s.nextLine();
		real= Double.parseDouble(aux);
		System.out.printf("Su variable double es: %.2f\n", real);
		System.out.println("Gracias por utilizar el programa");
	}

}
