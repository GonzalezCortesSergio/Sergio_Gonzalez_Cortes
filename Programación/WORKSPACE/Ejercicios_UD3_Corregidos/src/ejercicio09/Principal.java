package ejercicio09;

import java.util.Scanner;

public class Principal {

	
	public static void main (String args []) {
		
		int opcion;
		int numElegido;
		String aux;
		Scanner s = new Scanner(System.in);
		
		aux = s.nextLine();
		opcion = Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 1:
				System.out.println("Introduce tu número");
				aux = s.nextLine();
				numElegido = Integer.parseInt(aux);
				
		}
	}
}
