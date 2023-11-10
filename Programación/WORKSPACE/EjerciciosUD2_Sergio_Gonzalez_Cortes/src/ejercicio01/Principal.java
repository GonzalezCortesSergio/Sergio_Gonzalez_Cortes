package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("***********************************************"
				+ "************************************************************");
		System.out.println("Bienvenido, este programa comparará dos números "
				+ "y dirá cuál de los dos es mayor, incluso dirá si son iguales");
		System.out.println("***********************************************"
				+ "************************************************************");
		System.out.println("Introduzca un número");
		aux= s.nextLine();
		numero1= Integer.parseInt(aux);
		
		System.out.println("Introduzca otro");
		aux= s.nextLine();
		numero2= Integer.parseInt(aux);
		
		if (numero1>numero2) {
			
			System.out.printf("%d es mayor que %d\n", numero1, numero2);
			
		}
		
		if (numero2>numero1) {
			
			System.out.printf("%d es mayor que %d\n", numero2, numero1);
		}
		
		else {
			
			System.out.printf("%d es igual que %d\n", numero1, numero2);
		}
		
		System.out.println("  ");
		System.out.println("-----------------------------------------------"
				+ "-----------------------------------------------------------");
		System.out.println("Gracias por utilizar el programa");

	}

}
