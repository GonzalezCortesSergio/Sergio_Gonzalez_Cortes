package ejercicio10;

public class Maquina {

	
	//Atributos
	private Ticket t;
	private double saldoTotal;
	private String contrasenya;
	
	
	public double comprarBilletes (int cantidadTickets) {
		
		double total;
		
		total = cantidadTickets * t.getPrecioUnitario();
		
		return total;
	}
	
	public double calcularCambio (double dineroIngresado, int cantidadTickets) {
		
		double cambio = 0;
		
		cambio = dineroIngresado - comprarBilletes(cantidadTickets);
		
		return cambio;
	}
	
	public double calcularSaldoTotal (int cantidadTickets) {
		
		saldoTotal += comprarBilletes (cantidadTickets);
		
		return saldoTotal;
		
	}
	
	public void cambiarPrecioBillete (double precioN) {
		
		t.setPrecioUnitario(precioN);
	}
	
	public boolean comprobarContrasenya (String contrasenyaUsu) {
		
		if (contrasenyaUsu.equals(contrasenya)) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public void imprimirBillete(String nombreTitular, int cantidadTickets) {
		
		System.out.println("");
		System.out.printf("Su billete ha costado: %.2f€", saldoTotal);
	}
	
	
	
	
	
	
}
