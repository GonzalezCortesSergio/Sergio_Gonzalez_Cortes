package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float dinero;
		String nombre;
		float dineroquitar;
		String aux;
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("Bienvenido usuario, introduzca su nombre");
		System.out.println("****************************************");
		nombre= s.nextLine();
		
		System.out.printf("Caray %s, no se refleja el dinero que tiene en su cuenta"
				+ " bancaria, podría escribirlo con exactitud?\n", nombre);
		
		aux= s.nextLine();
		dinero= Float.parseFloat(aux);
		
		System.out.println("///////////////////////////////////////////////////////////"
				+ "////////////////////////////////////");
		
		System.out.printf("Bienvenido %s, cuenta con un saldo de %.2f euros. Introduzca"
				+ " la cantidad que desea sacar\n", nombre, dinero);
		aux= s.nextLine();
		dineroquitar= Float.parseFloat(aux);
		
		if (dineroquitar>dinero) {
			
			System.out.println("La cantidad elegida supera la cantidad en su cuenta");
		}
		
		else {
			
			dinero= dinero-dineroquitar;
			
			System.out.printf("Le queda en su cuenta %.2f euros\n", dinero);
		}
		
		System.out.println("///////////////////////////////////////////////////////////"
				+ "/////////////////////////////////////");
		
		System.out.println("  ");
		System.out.println("Gracias por utilizar el programa");
	}

}
