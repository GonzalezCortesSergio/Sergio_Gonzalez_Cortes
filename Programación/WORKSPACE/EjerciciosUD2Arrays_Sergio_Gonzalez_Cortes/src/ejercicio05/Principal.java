package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tam = 0;
		int numeros [];
		String aux;
		int numero1;
		int numero2;
		int opcion;
		int posicion;
		int desde;
		int hasta;
		int mayor;
		int menor;
		
		Scanner s= new Scanner(System.in);
		Random r= new Random(System.nanoTime());
		
		
		System.out.println("**************************************************"
				+ "*****************************************************");
		System.out.println("Bienvenido, este programa generará la cantidad de "
				+ "números aleatorios que desee con el dominio que desee");
		System.out.println("**************************************************"
				+ "*****************************************************");
		do {
			
		numero1= 0;
		numero2= 0;
		
		
		System.out.println("Indique cuántos números desea generar");
		
		while (tam <= 0){
			aux= s.nextLine();
			tam= Integer.parseInt(aux);
		
			if (tam <= 0 ) {
			
				System.out.println("No puede generar 0 números o un valor negativo de números");
				System.out.println("Vuelva a indicar");
			}
		}
		
		numeros= new int [tam];
		
		System.out.println("¿Desde qué numero quiere generar?");
		
		aux= s.nextLine();
		desde= Integer.parseInt(aux);
		
		System.out.println("¿Hasta qué número quiere generar?");
		
		aux= s.nextLine();
		hasta= Integer.parseInt(aux);
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i]= r.nextInt((hasta-desde)+desde);
			
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			numero1= numeros[i];
			
			numero2= numero2+numero1;
		}
		
		}while (opcion != 0);

	}

}
