package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		String texto;
		int numero;
		Copiado c1;
		String aux;
		
		//Instanciar Scanner
		Scanner s = new Scanner (System.in);
		
		//Bienvenida
		
		System.out.println("**********************************************************"
				+ "*********************************");
		System.out.println("Bienvenido, este programa te mostrará el texto que quieras"
				+ " la cantidad de veces que quieras");
		System.out.println("**********************************************************"
				+ "*********************************");
		
		System.out.println("Introduzca el texto");
		texto = s.nextLine();
		System.out.println("Introduzca la cantidad de veces que quiera que se repita (número entero positivo)");
		aux = s.nextLine();
		numero = Integer.parseInt(aux);
		
		c1 = new Copiado ();
		
		
	    c1.mostrarTexto(numero, texto);
		
		}
	}


