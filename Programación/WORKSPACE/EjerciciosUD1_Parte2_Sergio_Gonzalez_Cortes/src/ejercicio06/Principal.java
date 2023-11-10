package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		double precioh= 6.5;
		double horas;
		double horas2;
		double precioh2=7.5;
		String aux;
		double sueldo;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introduzca su nombre");
		nombre= s.nextLine();
		System.out.println("********************************************************************************************************************************");
		System.out.printf("Bienvenido %s, porfavor, introduzca las horas que"
				+ " ha trabajado (sin contar las extras) para realizar el cálculo de su sueldo\n",nombre);
		aux= s.nextLine();
		horas= Double.parseDouble(aux);
		
		System.out.printf("Usted ha trabajado %.1f horas, de haber realizado horas extra,"
				+ " introdúcelas, ya que éstas son remuneradas con un mayor sueldo "
				+ "(de no ser así, escriba 0)\n",horas);
		aux= s.nextLine();
		horas2= Double.parseDouble(aux);
		
		sueldo= (precioh*horas)+(precioh2*horas2);
		System.out.printf("Usted recibirá un sueldo de %.2f euros\n",sueldo);
		System.out.println("********************************************************************************************************************************");
		
		System.out.println("Gracias por utilizar el programa, que tenga un buen día.");
	}

}
