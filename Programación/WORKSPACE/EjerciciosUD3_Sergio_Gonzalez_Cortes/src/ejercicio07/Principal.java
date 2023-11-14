package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		int repetir = 34;
		int moneda;
		int monedaJugador;
		String aux;
		//Instanciar Scanner
		
		Scanner s = new Scanner(System.in);
		
		//Instanciar objeto
		
		Moneda m = new Moneda();
		
		//Bienvenida
		
		System.out.println("*".repeat(repetir));
		System.out.println("Bienvenido al juego de cara o cruz");
		System.out.println("*".repeat(repetir));
		System.out.println();
		System.out.println("Seleccione una de las opciones");
		do {
			
			System.out.println("------------------------");
			System.out.println("Opción 1:	Cara"); 
			System.out.println("Opción 2:	Cruz"); 
			System.out.println("------------------------");

			aux = s.nextLine();
			monedaJugador = Integer.parseInt(aux);
			
			moneda = m.lanzarMondeda();
			
			m.mostrarGanador(moneda);
			
			m.mostrarRepeticion(moneda, monedaJugador);
			
		}while (monedaJugador != moneda);
		
		System.out.println();
		System.out.println("*********************");
		System.out.println("¡¡Gracias por jugar!!");
		System.out.println("*********************");

	}
	

}
