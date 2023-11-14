package referente_ejercicio06;

import java.util.Random;

public class Generadora {

	
	//Métodos
	
	public int generarNum (int desde, int hasta) {
		
		int num = 0;
		Random r = new Random (System.nanoTime());
		num = r.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		
		int num = 0;
		num = generarNum (desde, hasta);
		return num;
	}
	
	public int generarParImpar (int desde, int hasta) {
		
		int num = 0;
		num = generarNum (desde, hasta);
		return num;	
	
	}
	

	
	public boolean comprobarParImpar (int desde, int hasta, int numParImpar) {
		
		boolean numPar;
		
		int num2;
		int dos = 2;
		
		
		num2 = generarParImpar (desde, hasta);
		
		if ((numParImpar+num2) % dos == 0) {
			
			numPar = true;
			
		}
		
		else {
			
			numPar = false;
		}
		
		return numPar;
		
	}
	
	public void mostrarParImpar (boolean numPar) {
		
		if (numPar == true ) {
			
			System.out.println("Ganan Pares");
		}
		
		else {
			
			System.out.println("Ganan Nones");
		}
	}
	
	public int generarChinos (int desde, int hasta) {
		
		int num = 0;
		num = generarNum (desde, hasta);
		return num;
		
	}
	
	public boolean comprobarChinos (int chinos, int desde, int hasta) {
		
		boolean numCorrecto;
		
		if (chinos == generarChinos(desde, hasta)) {
			
			numCorrecto = true;
		}
		
		else {
			
			numCorrecto = false;
		}
		
		return numCorrecto;
	}
	
	public void mostrarChinos (boolean numCorrecto, int chinos) {
		
		
		if (numCorrecto == true) {
			
			System.out.printf("Has acertado, son %d chinos", chinos);
		}
		
		else {
			
			System.out.printf("Has fallado, no son %d chinos", chinos);
		}
	}
}
