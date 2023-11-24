package ejercicio10;

public class Ticket {

	
	//Atributos
	private String nombre;
	private int pasajeros;
	private int viajes;
	private double precioUnitario;
	
	
	
	//Constructor
	public Ticket(String nombre, int pasajeros, int viajes, double precioUnitario) {
		this.nombre = nombre;
		this.pasajeros = pasajeros;
		this.viajes = viajes;
		this.precioUnitario = precioUnitario;
	}


	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getViajes() {
		return viajes;
	}


	public void setViajes(int viajes) {
		this.viajes = viajes;
	}
	
	public int getPasajeros () {
		
		return pasajeros;
	}
	
	public void setPasajeros (int pasajeros) {
		
		this.pasajeros = pasajeros;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	



	//toString
	@Override
	public String toString() {
		return "Ticket [nombre=" + nombre + ", pasajeros="+pasajeros+ ", viajes=" + viajes + ", precioUnitario=" + precioUnitario +"]";
	}
	
	
	
	
}
