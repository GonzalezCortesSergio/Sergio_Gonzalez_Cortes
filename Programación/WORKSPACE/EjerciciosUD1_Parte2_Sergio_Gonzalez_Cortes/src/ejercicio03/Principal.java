package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num;
		double millam= 1852;
		double numf;
		String aux;
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("//////////////////////////////////////////"
				+ "/////////////////////////////////////////////////////");
		System.out.println("Bienvenido, introduzca el valor en metros "
				+ "de la distancia que quiere calcular en millas marinas");
		System.out.println("//////////////////////////////////////////"
				+ "/////////////////////////////////////////////////////");
		aux= s.nextLine();
		num= Double.parseDouble(aux);
		numf= num/millam;
		System.out.printf("La distancia equivale a %.2f millas marinas\n", numf);
		System.out.println("******************************************"
				+ "*****************************************************");
		System.out.println("Gracias por utilizar el programa");
	}

}
