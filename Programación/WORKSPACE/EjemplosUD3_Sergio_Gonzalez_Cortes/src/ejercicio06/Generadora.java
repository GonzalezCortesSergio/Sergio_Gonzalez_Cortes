package ejercicio06;

public class Generadora {

	
	//Métodos
	
	public int generarNumAleatorio (int hasta, int desde) {
		
		int parametros;
		
		parametros = (hasta-desde+1)+desde;
		
		return parametros;
	}
	
	public void mostrarNumAleatorio (int numAleatorio) {
		
		System.out.println(numAleatorio);
	}
}
