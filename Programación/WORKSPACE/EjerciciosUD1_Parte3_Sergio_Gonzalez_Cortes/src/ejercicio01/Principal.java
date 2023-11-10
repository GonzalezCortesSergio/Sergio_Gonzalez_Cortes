package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double costefab;
		double ganancia;
		double porcentaje= 100;
		double pimpuestos;
		double impuestos;
		double costefin;
		String aux;
		
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("//////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido, introduzca el coste de fabricación de su automóvil");
		System.out.println("//////////////////////////////////////////////////////////////");
		
		aux= s.nextLine();
		costefab= Double.parseDouble(aux);
		
		System.out.println("Ahora introduzca en porcentaje la ganancia del vendedor");
		aux= s.nextLine();
		ganancia= Double.parseDouble(aux);
		
		System.out.println("Ahora introduzca los impuestos estatales aplicables");
		aux= s.nextLine();
		pimpuestos= Double.parseDouble(aux);
		impuestos= costefab*(pimpuestos/porcentaje);
		costefin= (costefab+(costefab*ganancia/porcentaje))+impuestos;
		
		
		System.out.printf("El coste final de su automóvil es de %.2f euros\n", costefin);
		System.out.println("**************************************************************");
		System.out.println("Gracias por utilizar el programa");
	}

}
