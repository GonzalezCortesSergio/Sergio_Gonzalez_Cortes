package ejercicio10;

public class Ticket {

	
	//Atributos
	private String codigo;
	private int viajes;
	private String fecha;
	
	
	//Constructor
	public Ticket(String codigo, int viajes, String fecha) {
		this.codigo = codigo;
		this.viajes = viajes;
		this.fecha = fecha;
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	//toString
	@Override
	public String toString() {
		return "Ticket [codigo=" + codigo + ", viajes=" + viajes + ", fecha=" + fecha + "]";
	}
	
	
	
}
