package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		short numpersonas;
		short numnoches;
		short numhab;
		short numcomidas;
		short porcentaje= 100;
		float preciohab;
		float costehab;
		float costenoches;
		float preciocomidas;
		float gastocomidas;
		float costecomidas;
		float gastotrans;
		float gastomuseos;
		float descuento;
		float nochedescuento;
		float preciototal;
		float dinerobanco= 600;
		float bizum;
		String aux;
		// TODO Auto-generated method stub
		 
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bienvenido, introduzca el número de personas");
		aux= s.nextLine();
		numpersonas= Short.parseShort(aux);
		
		System.out.println("Introduzca el número de noches en el hotel");
		aux= s.nextLine();
		numnoches= Short.parseShort(aux);
		
		System.out.println("Introduzca el número de habitaciones");
		aux= s.nextLine();
		numhab= Short.parseShort(aux);
		
		System.out.println("Introduzca el precio por habitación");
		aux= s.nextLine();
		preciohab= Float.parseFloat(aux);
		
		System.out.println("Introduzca cuánto descuento obtiene por ser cliente premium en porcentaje");
		aux= s.nextLine();
		descuento= Float.parseFloat(aux);
		
		System.out.println("Introduzca la cantidad gastada en una comida");
		aux= s.nextLine();
		preciocomidas= Float.parseFloat(aux);
		
		System.out.println("Introduzca cuántas comidas se han realizado");
		aux= s.nextLine();
		numcomidas= Short.parseShort(aux);
		
		System.out.println("Introduzca cuánto se ha gastado en transporte total");
		aux= s.nextLine();
		gastotrans= Float.parseFloat(aux);
		
		System.out.println("Introduzca cuánto se ha gastado en entradas de museos en total");
		aux= s.nextLine();
		gastomuseos= Float.parseFloat(aux);
		
		costehab= preciohab*numhab;
		costenoches= costehab*numnoches;
		nochedescuento= costenoches-(costenoches*descuento/porcentaje);
		
		gastocomidas= preciocomidas*numpersonas;
		costecomidas= gastocomidas*numcomidas;
		
		preciototal= nochedescuento+costecomidas+gastotrans+gastomuseos;
		
		System.out.println("  ");
		
		System.out.println("----------------------------------------");
		System.out.println("CONCEPTO\t\tPRECIO CONCEPTO\t\t");
		System.out.println("  ");
		System.out.printf("Hotel\t\t\t\t%.2f€\n", nochedescuento);
		System.out.printf("Comida\t\t\t\t%.2f€\n", costecomidas);
		System.out.printf("Transporte\t\t\t%.2f€\n", gastotrans);
		System.out.printf("Museos\t\t\t\t%.2f€\n", gastomuseos);
		System.out.println("  ");
		System.out.println("\t\t\t\tTOTAL");
		System.out.printf("\t\t\t\t%.2f€\n", preciototal);
		System.out.println("----------------------------------------");
		
		System.out.println("  ");
		
		dinerobanco= dinerobanco-preciototal;
		bizum= preciototal/numpersonas;
		
		System.out.println("************************************************");
		System.out.printf("Después del viaje le quedará en el banco %.2f€\n", dinerobanco);
		System.out.println("************************************************");
		
		System.out.println("**********************************");
		System.out.printf("El gasto por persona es de %.2f€\n", bizum);
		System.out.println("**********************************");
		
		System.out.println("Gracias por utilizar el programa");
		
		
	}

}
