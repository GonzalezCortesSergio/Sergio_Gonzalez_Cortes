package ejemplodowhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero, tope= 0;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		
		System.out.println("Bienvenido, imprimimos números dados por teclado");
		
		System.out.println("Introduzca un número");
		
		aux= s.nextLine();
		numero= Integer.parseInt(aux);
		
		
		do {
			System.out.println(numero);
			aux= s.nextLine();
			numero= Integer.parseInt(aux);
			
			
			
			
		} while (numero != tope);
		
		System.out.println("Sacabao");
	}

}
