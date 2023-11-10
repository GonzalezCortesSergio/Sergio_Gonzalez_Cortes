package ejemplobucle;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n , cero=0;
		String aux;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introduzca un número, cero para salir");
		aux= s.nextLine();
		n= Integer.parseInt(aux);
		
		while (n != cero) {
			
			System.out.println(n);
			System.out.println("Introduce otro número");
			aux= s.nextLine();
			n= Integer.parseInt(aux);
		}
		
		System.out.println("Sacabao");

	}

}
