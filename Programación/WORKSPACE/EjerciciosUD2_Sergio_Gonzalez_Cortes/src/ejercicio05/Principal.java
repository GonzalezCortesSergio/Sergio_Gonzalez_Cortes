package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double numero;
		double exponente;
		double exponentem1;
		double resultado;
		double cero= 0;
		double menosuno= -1;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("***********************************************"
				+ "*************");
		System.out.println("Bienvenido, este programa calculará la potencia"
				+ " de un número");
		System.out.println("**********************************************"
				+ "*************");
		
		System.out.println("Introduzca un número");
		aux= s.nextLine();
		numero= Float.parseFloat(aux);
		
		System.out.println("Ahora introduzca su exponente");
		aux= s.nextLine();
		exponente= Float.parseFloat(aux);
		
		
		if (exponente == cero) {
			
			System.out.println("El resultado de la operación es 1");
			
		}
		
		else if (exponente < cero) {
			
			exponentem1= exponente*menosuno;
			
			resultado= Math.pow(numero, exponentem1);
			
			System.out.printf("El resultado de la operación es 1/%.2f\n", resultado);
		}
		
		else {
			
			resultado= Math.pow(numero, exponente);
			
			System.out.printf("El resultado de la operación es %.2f\n", resultado);
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
