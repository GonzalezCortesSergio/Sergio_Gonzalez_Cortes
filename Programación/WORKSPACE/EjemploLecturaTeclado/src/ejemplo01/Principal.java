package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int edad= 0;
		double precio= 0.0;
		
		System.out.println("Bienvenido, introduzca su edad");
		
		edad= 23;
		
		System.out.println(edad);
		
		System.out.println("Introduzca una nueva");
		edad=Leer.datoInt();
		
		System.out.println("Su edad es "+ edad);
		
		System.out.println("Ahora un double");
		precio=Leer.datoDouble();
		
		System.out.printf("Su precio es de %.2f euros", precio);
	}

}
