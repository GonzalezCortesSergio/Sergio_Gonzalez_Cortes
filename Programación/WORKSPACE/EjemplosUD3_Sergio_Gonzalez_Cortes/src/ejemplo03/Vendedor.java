package ejemplo03;

public class Vendedor {

	
	//Atributos
	
	private String nombre;
	private double ventas;
	private int cantVehiculos;
	
	
	//Constructor
	
	public Vendedor(String nombre, double ventas, int cantVehiculos) {
		
		this.nombre = nombre;
		this.ventas = ventas;
		this.cantVehiculos = cantVehiculos;
	}


	
	
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getVentas() {
		return ventas;
	}


	public void setVentas(double ventas) {
		this.ventas = ventas;
	}


	public int getCantVehiculos() {
		return cantVehiculos;
	}


	public void setCantVehiculos(int cantVehiculos) {
		this.cantVehiculos = cantVehiculos;
	}





	@Override
	public String toString() {
		return "Vendedor = [nombre=" + nombre + ", ventas=" + ventas + ", cantVehiculos=" + cantVehiculos + "]";
	}
	
	
	
}
