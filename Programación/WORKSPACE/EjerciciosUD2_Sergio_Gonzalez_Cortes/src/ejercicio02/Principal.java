package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		String aux;
		double resultado;
		double constante= 0;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("**********************************************************");
		System.out.println("Bienvenido, este programa hará una división de dos números");
		System.out.println("**********************************************************");
		
		System.out.println("Introduzca un número (puede tener decimales)");
		aux= s.nextLine();
		numero1= Double.parseDouble(aux);
		
		System.out.println("Introduzca otro (igualmente puede tener decimales)");
		aux= s.nextLine();
		numero2= Double.parseDouble(aux);
		
		if (numero2== constante) {
			
			System.out.println("-------------------------------------");
			System.out.println("ERROR, NO SE PUEDE DIVIDIR ENTRE CERO");
			System.out.println("-------------------------------------");
		}
		else {
			
			resultado= numero1/numero2;
			
			System.out.printf("El resultado de la división es %.2f\n", resultado);
		}
		System.out.println("  ");
		System.out.println("////////////////////////////////////////////////");
		System.out.println("	Gracias por utilizar el programa");
		System.out.println("////////////////////////////////////////////////");
	}

}
