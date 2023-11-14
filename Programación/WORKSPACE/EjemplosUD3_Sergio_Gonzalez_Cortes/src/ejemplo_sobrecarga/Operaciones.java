package ejemplo_sobrecarga;

public class Operaciones {

	
	//Métodos
	
	//(Para sobrecargar únicamente se puede cambiar el orden, y el tipo de las variables)
	
	public double sumar (double a, double b) {
		
		return a+b;
	}
	
	public int sumar (int a, int b) {
		
		return a+b;
	}
	
	public double sumar (int a, double b) {
		
		return a+b;
	}
}
