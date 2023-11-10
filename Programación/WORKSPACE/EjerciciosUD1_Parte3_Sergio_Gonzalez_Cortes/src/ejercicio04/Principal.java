package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String aux;
		double radio;
		int constante= 2;
		double area;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Bienvenido, vamos a calcular el área de un círculo.");
		System.out.println("Introduzca el radio en metros");
		aux= s.nextLine();
		radio= Double.parseDouble(aux);
		area= Math.PI*Math.pow(radio, constante);
		System.out.printf("El área del círculo es de %.2f metros cuadrados\n",area);
		System.out.println("************************************************");
		System.out.println("Gracias por utilizar el programa");
	}

}
