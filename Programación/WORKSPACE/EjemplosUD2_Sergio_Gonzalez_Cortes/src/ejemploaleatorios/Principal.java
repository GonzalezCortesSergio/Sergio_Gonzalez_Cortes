package ejemploaleatorios;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Random num= new Random(System.nanoTime());
		int numeroaleatorio;
		int hasta;
		int desde;
		int tope;
		String aux;
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Desde qué número hasta qué número quieres que se genere el"
				+ " número aleatorio");
		
		System.out.println("Desde:");
		aux= s.nextLine();
		desde= Integer.parseInt(aux);
		
		System.out.println("Hasta:");
		aux= s.nextLine();
		hasta= Integer.parseInt(aux);
		
		System.out.println("¿Cuántos números aleatorios quiere crear?");
		aux= s.nextLine();
		tope= Integer.parseInt(aux);
		
		for (int i=0; i<tope; i++) {
			
		numeroaleatorio= num.nextInt((hasta-desde+1)+desde);
		
		System.out.println(numeroaleatorio);
		}

	}

}

