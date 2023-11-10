package ejemplo03;

public class Vehiculo {

	
	//Atributos
	private String nombre;
	private double precio;
	private int numRuedas;
	
	
	//Constructor
	
	public Vehiculo (String nombre, double precio, int numRuedas) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.numRuedas = numRuedas;
		
		
	}
	
	//Getters and Setters
	
	//Nombre
	public String getNombre () {
		return nombre;
	}
	
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	//Precio
	
	public double getPrecio () {
		
		return precio;
	}
	
	public void setPrecio (double precio) {
		
		this.precio = precio;
	}
	
	//Número ruedas
	
	public int getNumRuedas () {
		
		return numRuedas;
	}
	
	public void setNumRuedas (int numRuedas) {
		
		this.numRuedas = numRuedas;
	}
	
	
}
