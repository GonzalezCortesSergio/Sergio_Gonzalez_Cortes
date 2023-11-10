package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int nentradas;
		double pentradas;
		String diasemana;
		String miercoles= ("Miércoles");
		double descuento= 30;
		double porcentaje= 100;
		double preciofinal;
		double preciodescuento;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("**************************************************************"
				+ "*******");
		System.out.println("Bienvenido, este programa calculará su precio final al entrar "
				+ "al cine");
		System.out.println("**************************************************************"
				+ "*******");
		
		System.out.println("Introduzca el precio de las entradas");
		aux= s.nextLine();
		pentradas= Double.parseDouble(aux);
		
		System.out.println("Ahora introduzca el número de entradas");
		aux= s.nextLine();
		nentradas= Integer.parseInt(aux);
		
		System.out.println("Dependiendo del día de la semana puede recibir un descuento del"
				+ " 30%. Introduzca el día de hoy");
		diasemana= s.nextLine();
		
		preciofinal= pentradas*nentradas;
		
		if (diasemana.equals(miercoles)) {
			
			descuento= descuento/porcentaje;
			preciodescuento= preciofinal - (preciofinal*descuento);
			
			System.out.printf("Le costará entrar al cine %.2f€", preciodescuento);
		}
		
		else {
			
			System.out.printf("Le costará entrar al cine %.2f€", preciofinal);
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}

}
