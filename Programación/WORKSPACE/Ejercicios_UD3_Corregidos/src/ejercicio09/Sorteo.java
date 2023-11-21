package ejercicio09;

import java.util.Random;

public class Sorteo {

	
	//Cambiar numLoteria a numPremiado
	
	private int numLoteria;
	
	
	public Sorteo (int numLoteria) {
		
		this.numLoteria = numLoteria;
	}
	
	/*public int comprobarNumElegido (int numElegido) {
		
		//No se imprime en métodos de calcular ni
		//inventandonos otro método
	}*/
	/*Si no lo hacemos con if en el main, lo hacemos poniendo un boolean*/
	
	public int sacarNumeroAleatorio () {
		
		//el desde y el hasta se pueden poner como parámetro
		
		int desde = 000001, hasta = 999999;
		
		Random r = new Random (System.nanoTime());
		
		return r.nextInt(hasta-desde+1)+desde;
	}
	
}
