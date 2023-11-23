package ejercicio10;

public class Ticket {

	
	//Atributos
	private String codigo;
	private int pasajeros;
	private int viajes;
	private double precioUnitario;
	
	
	
	//Constructor
	public Ticket(String codigo, int pasajeros, int viajes, double precioUnitario) {
		this.codigo = codigo;
		this.pasajeros = pasajeros;
		this.viajes = viajes;
		this.precioUnitario = precioUnitario;
	}


	
	//Getters and Setters
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		return "Ticket [codigo=" + codigo + ", pasajeros="+pasajeros+ ", viajes=" + viajes + ", precioUnitario=" + precioUnitario +"]";
	}
	
	
	
}
