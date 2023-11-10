package ejemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		int edad= 0;
		String aux;
		double precio=0;
		
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Por favor, introduzca su nombre");
		nombre=scn.nextLine();
		
		System.out.printf("Bienvenido %s, espero que este programa"
				+ " le resulte útil\n",nombre);
		System.out.println("¿Cuál es su edad?");
		aux=scn.nextLine();
		edad=Integer.parseInt(aux);
		System.out.println("Usted tiene " +edad+ " años");
		
		System.out.println("Dígame el precio final de la última compra que ha realizado");
		aux=scn.nextLine();
		precio=Double.parseDouble(aux);
		System.out.printf("El precio final de su última compra es de %.2f €",precio);
		
	}

}
