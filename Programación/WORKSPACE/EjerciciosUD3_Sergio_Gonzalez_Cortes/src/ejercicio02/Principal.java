package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		Circulo c1;
		double radio;
		String aux;
		double area;
		
		
		//Instanciar Scanner
		Scanner s = new Scanner(System.in);
		
		
		//Bienvenida
		
		System.out.println("*********************************************************");
		System.out.println("Bienvenido, este programa calculará el área de un círculo");
		System.out.println("*********************************************************");
		
		//Petición de datos
		System.out.println("Introduzca el radio del círculo (cm)");
		
		aux= s.nextLine();
		radio= Double.parseDouble(aux);
		
		//Instanciar objeto
		
		c1= new Circulo (radio);
		
		
		//Acciones objeto
		
		area= c1.calcularArea();
		
		c1.mostrarResultado(area);

	}

}
