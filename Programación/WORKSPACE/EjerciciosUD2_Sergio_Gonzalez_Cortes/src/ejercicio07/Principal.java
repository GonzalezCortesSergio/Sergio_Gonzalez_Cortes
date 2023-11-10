package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double precio;
		double preciocant;
		double preciofinal;
		int cantidad;
		double descuento;
		int porcentaje= 100;
		int cien= 100;
		String aux;
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("****************************************************************");
		System.out.println("Bienvenido, este programa calculará el precio final de su compra");
		System.out.println("****************************************************************");
		
		System.out.println("Introduzca el precio del producto");
		aux= s.nextLine();
		precio= Double.parseDouble(aux);
		
		System.out.println("Introduzca la cantidad");
		aux= s.nextLine();
		cantidad= Integer.parseInt(aux);
		
		System.out.println("Introduzca su descuento en porcentaje");
		aux= s.nextLine();
		descuento= Double.parseDouble(aux);
		
		
		preciocant= precio*cantidad;
		
		
		if (preciocant >= cien) {
			
			descuento= descuento/porcentaje;
			
			preciofinal= preciocant-(preciocant*descuento);
			
			System.out.printf("El precio final de su compra es de %.2f€\n", preciofinal);
			
		}
		
		else {
			
			preciofinal= preciocant;
			
			
			System.out.printf("No es posible aplicar el descuento, ya que su precio final es"
					+ " de %.2f€, no llega a 100€\n", preciofinal);
		}
		
		System.out.println("  ");
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");
	}

}
