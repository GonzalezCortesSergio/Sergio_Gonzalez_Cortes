package ejemploarrays01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edades [];
		int edad;
		int posicion;
		String aux;
		
		Scanner s= new Scanner(System.in);
		edades= new int [30];
		
		System.out.println("Introduzca su edad");
		
		aux= s.nextLine();
		edad= Integer.parseInt(aux);
		
		System.out.println("Introduzca la posición en la que quiere que se inserte la edad");
		
		aux= s.nextLine();
		posicion= Integer.parseInt(aux)-1;
		
		
		edades[posicion]= edad;
		
		System.out.println(edades[posicion]);
			
			
		}

	}


