package ejercicio09;

import java.util.Random;

public class Sorteo {

	
	//Métodos
	
	public int generarNumero () {
		int desde = 00001;
		int hasta = 99999;
		
		Random r = new Random(System.nanoTime());
		
		return r.nextInt(hasta-desde)+desde;
		 
	}
}
