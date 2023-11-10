package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double resultado;
		double resultadoguardado= 0;
		int opcion;
		int opcioncalculo;
		int dos= 2;
		String aux;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("******************************************************");
		System.out.println("Bienvenido, este programa actuará como una calculadora");
		System.out.println("******************************************************");
		System.out.println("  ");
		
		System.out.println("Pulse una de las opciones");
		
		do {
			
			
		
			System.out.println("--------------------------------");
			System.out.println("0		Salir");
			System.out.println("1		Sumar");
			System.out.println("2		Restar");
			System.out.println("3		Multiplicar");
			System.out.println("4		Dividir");
			System.out.println("5		Par o impar");
			System.out.println("--------------------------------");
			
			aux= s.nextLine();
			opcion= Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 0:			 //Opción de salida y despedida
					
					System.out.println("  ");
					System.out.println("--------------------------------");
					System.out.println("Gracias por utilizar el programa");
					System.out.println("--------------------------------");
					
					break;
					
				case 1: 		 //Opción de suma
					
					if (resultadoguardado != 0) {
						
						System.out.println("Introduzca 1 si quiere utilizar el resultado de su anterior operación");
						System.out.println("Introduzca 0 si no");
						
						
						
						do {
							
							aux= s.nextLine();
							opcioncalculo= Integer.parseInt(aux);
							
							switch (opcioncalculo) {		//Posibilidad de usar un cálculo anterior
						
								case 1:
									System.out.println("Introduzca otro número para realizar la suma");
									aux= s.nextLine();
									numero2= Double.parseDouble(aux);
								
									resultado= resultadoguardado+numero2;
									resultadoguardado= resultado;
								
									System.out.printf("El resultado de la suma es %.2f\n", resultado);
								
									break;
								
								case 0:
								
									System.out.println("Introduzca dos números para realizar la suma");
									aux= s.nextLine();
									numero1= Double.parseDouble(aux);
									aux= s.nextLine();
									numero2= Double.parseDouble(aux);
								
									resultado= numero1+numero2;
									resultadoguardado= resultado;
								
									System.out.printf("El resultado de la suma es %.2f\n", resultado);
								
									break;
								
								default:
									
									System.out.println("Opción equivocada");
									
									break;
					
								
							}
						
						}while (opcioncalculo > 1);
						}
					
						else {		//No existe un cálculo anterior
						
							System.out.println("Introduzca dos números para realizar la suma");
							aux= s.nextLine();
							numero1= Double.parseDouble(aux);
							aux= s.nextLine();
							numero2= Double.parseDouble(aux);
					
							resultado= numero1+numero2;
							resultadoguardado= resultado;
					
							System.out.printf("El resultado de la suma es %.2f\n", resultado);
						
						}
					
						break;
						
					case 2:		//Opción resta
						
						if(resultadoguardado != 0) {
						
							System.out.println("Introduzca 1 si quiere utilizar el resultado de su anterior operación");
							System.out.println("Introduzca 0 si no");
							
							do {
								
								aux= s.nextLine();
								opcioncalculo= Integer.parseInt(aux);
								
								switch (opcioncalculo) {		//Posibilidad de usar un cálculo anterior
								
									case 1: 
										
										System.out.println("Introduzca otro número para realizar la resta");
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= resultadoguardado-numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la resta es %.2f\n", resultado);
									
										break;
										
									case 0:
										
										System.out.println("Introduzca dos números para realizar la resta");
										aux= s.nextLine();
										numero1= Double.parseDouble(aux);
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= numero1-numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la resta es %.2f\n", resultado);
									
										break;
									
									default:
										
										System.out.println("Opción equivocada");
										
										break;
								}
								
							}while (opcioncalculo > 1);
							
						}
						
						else {
							
							System.out.println("Introduzca dos números para realizar la resta");
							aux= s.nextLine();
							numero1= Double.parseDouble(aux);
							aux= s.nextLine();
							numero2= Double.parseDouble(aux);
						
							resultado= numero1-numero2;
							resultadoguardado= resultado;
						
							System.out.printf("El resultado de la resta es %.2f\n", resultado);
						}
						
						
						break;
						
						
						
					case 3:		//Opción multiplicación
						
						if(resultadoguardado != 0) {
							
							System.out.println("Introduzca 1 si quiere utilizar el resultado de su anterior operación");
							System.out.println("Introduzca 0 si no");
							
							do {
								
								aux= s.nextLine();
								opcioncalculo= Integer.parseInt(aux);
								
								switch (opcioncalculo) {		//Posibilidad de usar un cálculo anterior
								
									case 1: 
										
										System.out.println("Introduzca otro número para realizar la multiplicación");
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= resultadoguardado*numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la multiplicación es %.2f\n", resultado);
									
										break;
										
									case 0:
										
										System.out.println("Introduzca dos números para realizar la multiplicación");
										aux= s.nextLine();
										numero1= Double.parseDouble(aux);
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= numero1*numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la multiplicación es %.2f\n", resultado);
									
										break;
									
									default:
										
										System.out.println("Opción equivocada");
										
										break;
								}
								
							}while (opcioncalculo > 1);
							
						}
						
						else {
							
							System.out.println("Introduzca dos números para realizar la multiplicación");
							aux= s.nextLine();
							numero1= Double.parseDouble(aux);
							aux= s.nextLine();
							numero2= Double.parseDouble(aux);
						
							resultado= numero1*numero2;
							resultadoguardado= resultado;
						
							System.out.printf("El resultado de la multiplicación es %.2f\n", resultado);
						}
						
						
						break;
						
					case 4:		//Opción división
						
						if(resultadoguardado != 0) {
							
							System.out.println("Introduzca 1 si quiere utilizar el resultado de su anterior operación");
							System.out.println("Introduzca 0 si no");
							
							do {
								
								aux= s.nextLine();
								opcioncalculo= Integer.parseInt(aux);
								
								switch (opcioncalculo) {		//Posibilidad de usar un cálculo anterior
								
									case 1: 
										
										System.out.println("Introduzca otro número para realizar la división");
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= resultadoguardado/numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la división es %.2f\n", resultado);
									
										break;
										
									case 0:
										
										System.out.println("Introduzca dos números para realizar la división");
										aux= s.nextLine();
										numero1= Double.parseDouble(aux);
										aux= s.nextLine();
										numero2= Double.parseDouble(aux);
									
										resultado= numero1/numero2;
										resultadoguardado= resultado;
									
										System.out.printf("El resultado de la división es %.2f\n", resultado);
									
										break;
									
									default:
										
										System.out.println("Opción equivocada");
										
										break;
								}
								
							}while (opcioncalculo > 1);
							
						}
						
						else {
							
							System.out.println("Introduzca dos números para realizar la división");
							aux= s.nextLine();
							numero1= Double.parseDouble(aux);
							aux= s.nextLine();
							numero2= Double.parseDouble(aux);
						
							resultado= numero1/numero2;
							resultadoguardado= resultado;
						
							System.out.printf("El resultado de la resta es %.2f\n", resultado);
						}
						
						
						break;
						
						
					case 5:			//Opción par o impar
						
						System.out.println("Introduzca un número y se dirá si es par o impar");
						
						aux= s.nextLine();
						numero1= Double.parseDouble(aux);
						resultadoguardado= numero1;
						
						if (numero1%dos == 0) {
							
							System.out.println("El número es par");
						}
						
						else  {
							
							System.out.println("El número es impar");
						}
						
						break;
						
						
					default:
						
						System.out.println("Opción equivocada");
						
						break;
							
							
						
				}
			}while (opcion != 0);
		}

	}
