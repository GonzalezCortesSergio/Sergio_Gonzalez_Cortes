package ejemplofor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int tope ;
		String aux;
		String palabra;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bienvenido, este programa escribirá la palabra"
				+ " que escojas el número de veces que quieras");
		
		System.out.println("Introduzca una palabra");
		palabra= s.nextLine();
		
		System.out.println("Introduzca el número de veces");
		aux= s.nextLine();
		tope= Integer.parseInt(aux);
		
		
		for (int i=0; i < tope ; i++) {
			
			System.out.println(palabra);
		}
		

	}

}
