package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero;
		int dos= 2 ;
		String aux;
		int cero= 0;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("*************************************"
				+ "******************************");
		System.out.println("Bienvenido, este programa dirá si el "
				+ "número que escribe es par o no");
		System.out.println("*************************************"
				+ "******************************");
		
		System.out.println("Introduzca un número entero");
		aux= s.nextLine();
		numero= Integer.parseInt(aux);
		
		if (numero%dos == cero) {
			
			System.out.println("El número es par");
		}
		else  {
			System.out.println("El número es impar");
		}
		
		System.out.println("  ");
		System.out.println("Gracias por utilizar el programa");
	}

}
