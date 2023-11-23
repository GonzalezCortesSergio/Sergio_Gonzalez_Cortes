package ejercicio10;

public class Maquina {

	
	//Atributos
	private Ticket t;
	
	
	//Constructor
	
	public Maquina (Ticket t) {
		
		this.setT(t);
	}


	public Ticket getT() {
		return t;
	}


	public void setT(Ticket t) {
		this.t = t;
	}
	
	public double dineroADevolver (double dineroAPagar) {
		
		return dineroAPagar-t.getPrecioUnitario();
	}
	
	
	
	
	
}
