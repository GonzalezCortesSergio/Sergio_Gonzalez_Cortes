package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		short nsala;
		float preciosala;
		float preciofinal;
		short npersonas;
		String aux;
		String peli;
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("*************************************************");
		System.out.println("Bienvenido, están disponibles la sala 1, 2, 3 y 4");
		
		System.out.println("Introduzca el número de la sala que desea");
		
		System.out.println("*************************************************");
		aux= s.nextLine();
		nsala= Short.parseShort(aux);
		
		System.out.println("Introduzca la película proyectada");
		peli= s.nextLine();
		
		System.out.println("Introduzca el precio de la sala");
		aux= s.nextLine();
		preciosala= Float.parseFloat(aux);
		
		System.out.println("Introduzca el número de personas");
		aux= s.nextLine();
		npersonas= Short.parseShort(aux);
		
		
		preciofinal= preciosala*npersonas;
		
		switch (nsala) {
		
			case 1:
				
				System.out.printf("Sala VIP, precio %.2f euros\n", preciosala);
				
				System.out.printf("Película %s\n", peli);
				
				System.out.printf("Número de personas %d\n", npersonas);
				
				System.out.printf("Preciofinal %.2f euros\n", preciofinal);
				
				break;
				
			case 2: 
				
				System.out.printf("Sala normal, precio %.2f euros\n", preciosala);
				
				System.out.printf("Película %s\n", peli);
				
				System.out.printf("Número de personas %d\n", npersonas);
				
				System.out.printf("Preciofinal %.2f euros\n", preciofinal);
				
				break;
				
			case 3: 
				
				System.out.printf("Sala infantil, precio %.2f\n", preciosala);
				
				System.out.printf("Película %s\n", peli);
				
				System.out.printf("Número de personas %d\n", npersonas);
				
				System.out.printf("Precio final %.2f euros\n", preciofinal);
				
				break;
				
			case 4:
				
				System.out.printf("Sala 3D, precio %.2f euros\n", preciosala);
				
				System.out.printf("Película %s\n", peli);
				
				System.out.printf("Número de personas %d\n", npersonas);
				
				System.out.printf("Preciofinal %.2f euros\n", preciofinal);
				
				break;
				
			default: System.out.println("Opción equivocada");
				
		}
		
		System.out.println("Gracias, que disfrute de la película");
	}

}
