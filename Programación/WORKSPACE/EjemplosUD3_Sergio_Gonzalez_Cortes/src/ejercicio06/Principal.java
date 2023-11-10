package ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int opcion;
		String aux;
		int desde;
		int hasta;
		Generadora g1;
		int numAleatorio;
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		//Instanciar Random
		Random r = new Random(System.nanoTime());
		
		
		//Bienvenida
		
		System.out.println("*****************************************************"
				+ "********************************");
		System.out.println("Bienvenido, este programa le mostrará varias opciones"
				+ " referentes a números aleatorios");
		System.out.println("*****************************************************"
				+ "********************************");
		
		//Pedir datos
		System.out.println("Introduzca el mínimo");
		aux = s.nextLine();
		desde = Integer.parseInt(aux);
		System.out.println("Introduzca el máximo");
		aux = s.nextLine();
		hasta = Integer.parseInt(aux);
		
		//Instanciar objeto 
		
		g1 = new Generadora ();
		
		numAleatorio = r.nextInt(g1.generarNumAleatorio(hasta, desde));
		
		g1.mostrarNumAleatorio(numAleatorio);
		
		
	}

}
