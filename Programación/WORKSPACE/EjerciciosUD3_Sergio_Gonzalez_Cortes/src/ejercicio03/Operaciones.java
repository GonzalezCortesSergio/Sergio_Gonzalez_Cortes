package ejercicio03;

public class Operaciones {

	
	//Acciones
	public boolean mirarValor (int entero) {
		
		boolean valorPositivo;
		
		if (entero < 0) {
			
			valorPositivo = false;
		}
		
		else {
			
			valorPositivo = true;
			
		}
		
		return valorPositivo;	
		
	}
	
	public void mostrarValor (boolean valorPositivo) {
		
		if (valorPositivo == false) {
			
			System.out.println("El número es negativo");
		}
		
		else {
			
			System.out.println("El número es positivo");
		}
	}
	
	public boolean mirarParImpar (int entero) {
		
		boolean nPar;
		int dos = 2;
		
		if (entero % dos == 0 ) {
			
			nPar = true;
			
		}
		
		else {
			
			nPar = false;
		}
		
		return nPar;
	}
	
	public void mostrarParImpar (boolean nPar) {
		
		if (nPar == true) {
			
			System.out.println("El número es par");
		}
		else {
			
			System.out.println("El número es impar");
		}
	}
}
