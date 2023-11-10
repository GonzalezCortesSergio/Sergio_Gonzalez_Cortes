package ejemploticket;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String producto;
		int cantidad;
		String aux;
		double precio;
		double subTotal;
		Scanner s= new Scanner (System.in);
		
		System.out.println("Bienvenido, diga el nombre de su producto");
		producto=s.nextLine();
		System.out.println("Ahora diga la cantidad de su producto");
		aux=s.nextLine();
		cantidad=Integer.parseInt(aux);
		System.out.println("Ahora diga el precio de su producto");
		aux=s.nextLine();
		precio=Double.parseDouble(aux);
		System.out.println("Bienvenido a la tienda");
		subTotal=cantidad*precio;
		System.out.println("Producto\tCantidad\tPrecio Unitario\t\tPrecio");
		System.out.println("***************************************************************");
		System.out.printf("%s\t%d\t\t%.2f€\t\t\t%.2f€",producto,cantidad,precio,subTotal);
		
		

	}

}
