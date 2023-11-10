package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero;
		int doble= 2;
		int triple= 3;
		int mitad= 2;
		int numf;
		String aux;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("///////////////////////////////////////////////////////"
				+ "////////////////////////////////////////");
		System.out.println("Bienvenido, introduzca un número entero, y el programa "
				+ "mostrará su doble, su triple y su mitad");
		System.out.println("//////////////////////////////////////////////////////"
				+ "/////////////////////////////////////////");
		aux= s.nextLine();
		numero= Integer.parseInt(aux);
		numf= numero*doble;
		System.out.printf("El doble de su número es %d\n", numf);
		numf= numero*triple;
		System.out.printf("El triple de su número es %d\n", numf);
		numf= numero/mitad;
		System.out.printf("La mitad de su número es %d\n", numf);
		System.out.println("*******************************************************"
				+ "*****************************************");
		System.out.println("Gracias por utilizar el programa");
	}

}
