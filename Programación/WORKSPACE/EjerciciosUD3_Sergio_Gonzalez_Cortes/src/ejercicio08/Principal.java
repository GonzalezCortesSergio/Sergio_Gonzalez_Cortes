package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		String nombreTitular;
		String aux;
		double saldo = 0;
		double dinero;
		double valorDolar;
		int opcion;
		Cuenta c;
		
		//Instanciar Scanner 
		
		Scanner s = new Scanner(System.in);
		
		//Bienvenida
		
		System.out.println("*******************************************");
		System.out.println("Bienvenido, introduzca su nombre de titular");
		System.out.println("*******************************************");

		
		nombreTitular = s.nextLine();
		
		//Instanciar Cuenta
		c = new Cuenta(saldo, nombreTitular);
		
		
		System.out.println("Bienvenido "+nombreTitular+", escoja una de las"
				+ " opciones disponibles");
		System.out.println();
		
		do {
			
			System.out.println("-".repeat(43));
			System.out.println("""
					Opción 1:	Ingresar dinero
					Opción 2:	Retirar dinero
					Opción 3:	Pasar su dinero a dólares
					Opción 4:	Consultar su saldo
					Opción 0:	Salir""");
			System.out.println("-".repeat(43));
		
			aux = s.nextLine();
		
			opcion = Integer.parseInt(aux);
		
			switch(opcion) {
		
				case 1:
					
					System.out.println("Introduzca la cantidad que quiere ingresar");
					
					aux = s.nextLine();
					dinero = Double.parseDouble(aux);
					
					c.ingresarDinero(dinero);
					
					break;
					
				case 2:
					
					System.out.println("Introduzca la cantidad que quiera retirar");
					
					aux = s.nextLine();
					dinero = Double.parseDouble(aux);
					
					if (dinero <= c.getSaldo()) {
					
						c.retirarDinero(dinero);
					
					}
					
					else {
						
						System.out.println("No es posible sacar más dinero del que dispones");
					}
					break;
					
				case 3:
					
					System.out.println("Introduzca el valor en euros del dolar actualmente");
					
					aux = s.nextLine();
					valorDolar = Double.parseDouble(aux);
					
					System.out.printf("%.2f $\n",c.pasarADolares(valorDolar));
					
					break;
					
				case 4:
					
					c.consultarSaldo();
					
					break;
					
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			}
		
		}while (opcion != 0);
	}

}
