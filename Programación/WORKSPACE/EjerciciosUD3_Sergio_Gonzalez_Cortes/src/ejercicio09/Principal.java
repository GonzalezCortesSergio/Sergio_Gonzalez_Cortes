package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int numeroElegido = 0;
		int numeroGanador;
		String aux;
		int opcion;
		Sorteo s = new Sorteo();
		
		//Instanciar Scanner
		Scanner sc = new Scanner(System.in);
		
		//Bienvenida
		
		System.out.println("///////////////////////////////////");
		System.out.println("//	LOTERÍA DE NAVIDAD	 //");
		System.out.println("///////////////////////////////////");
		
		do {
		
			System.out.println();
			System.out.println("""
					--------------------------------------------
					Opción 1:	Comprar un décimo elegido
					Opción 2:	Comprar un décimo aleatorio
					Opción 3:	Comprobar ganador 
					Opción 0:	Salir
					--------------------------------------------
					""");
			
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("Diga el número que quiere comprar"
							+ " (desde 00001 hasta 99999)");
					aux = sc.nextLine();
					numeroElegido = Integer.parseInt(aux);
					
					break;
					
				case 2:
					
					numeroElegido = s.generarNumero();
					
					System.out.println("Su número es "+numeroElegido);
					
					break;
					
				case 3:
					
					numeroGanador = s.generarNumero();
					
					s.mostrarGanador(numeroElegido, numeroGanador);
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
		
		
		}while (opcion != 0);
		
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("Gracias por hacer que cada día sea especial. Feliz Navidad");
		System.out.println("**********************************************************");

	}

}
