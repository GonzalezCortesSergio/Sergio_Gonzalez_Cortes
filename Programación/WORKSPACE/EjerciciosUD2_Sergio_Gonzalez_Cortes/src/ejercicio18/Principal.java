package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double saldo;
		int entrada;
		double costenumentrada;
		double retirar;
		double ingresar;
		double costentrada;
		int opcion;
		int cero= 0;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("****************************************************");
		System.out.println("Bienvenido usuario. Introduzca el saldo de su cuenta");
		System.out.println("****************************************************");
		
		aux= s.nextLine();
		saldo= Double.parseDouble(aux);
		
		System.out.println("Presione un número para elegir una opción");
		
		do {
			
		
			System.out.println("------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Ver saldo");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Comprar entradas");
			System.out.println("4. Ingresar dinero");
			System.out.println("------------------------------");
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch(opcion) {
		
				case 0:
				
					System.out.println("********************************");
					System.out.println("Gracias por utilizar el programa");
					System.out.println("********************************");
				
				
					break;
		
				case 1:
				
					System.out.println("------------------------------");
					System.out.printf("Cuenta con un saldo de %.2f€\n", saldo);
					System.out.println("------------------------------");
				
					break;
				
				case 2:
				
					System.out.println("Introduzca la cantidad que quiere retirar");
					aux= s.nextLine();
					retirar= Double.parseDouble(aux);
				
					if (retirar > saldo) {
					
						System.out.println("-------------------------------------------------");
						System.out.println("No es posible retirar más dinero del que dispones");
						System.out.println("-------------------------------------------------");
					}
				
					else {
						saldo= saldo-retirar;
					
						System.out.println("------------------------------");
						System.out.printf("Ahora cuentas con %.2f€\n", saldo);
						System.out.println("------------------------------");
					}
				
					break;
				
				case 3:
				
					System.out.println("¿Cuánto cuestan las entradas?");
					aux= s.nextLine();
					costentrada= Double.parseDouble(aux);
				
					System.out.println("¿Cuántas entradas quiere comprar?");
					aux= s.nextLine();
					entrada= Integer.parseInt(aux);
				
					costenumentrada= costentrada*entrada;
				
					if (costenumentrada > saldo) {
						System.out.println("-------------------------------------------------------------"
								+ "----------------------");
						System.out.println("No es posible comprarla/s porque el precio de la/s entrada/s "
								+ "es superior a su saldo");
						System.out.println("-------------------------------------------------------------"
								+ "----------------------");
					
					
					}
				
					else {
					
						saldo= saldo-costenumentrada;
					
						System.out.println("------------------------------");
						System.out.printf("Cuenta con un saldo de %.2f€\n", saldo);
						System.out.println("------------------------------");
					}
				
				
					break;
				
				case 4:
				
					System.out.println("¿Cuánto dinero quiere ingresar?");
					aux= s.nextLine();
					ingresar= Double.parseDouble(aux);
				
					saldo= saldo+ingresar;
				
					System.out.println("------------------------------");
					System.out.printf("Cuenta con un saldo de %.2f€\n", saldo);
					System.out.println("------------------------------");
				
					break;
				
				default:
				
					System.out.println("Opción errónea");
				
					break;
				
			}
			}while (opcion != cero);
		
		
	}

}
