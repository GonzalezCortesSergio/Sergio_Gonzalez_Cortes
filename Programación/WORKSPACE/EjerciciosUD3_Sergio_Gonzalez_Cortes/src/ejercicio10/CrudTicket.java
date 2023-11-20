package ejercicio10;

import java.util.Arrays;

public class CrudTicket {

	//Atributos
	private Ticket [] ticketsRegistrados;
	
	public CrudTicket (Ticket [] ticketRegistrados) {
		
		this.ticketsRegistrados = ticketRegistrados;
	}

	
	//Getters and Setters
	public Ticket[] getTicketsRegistrados() {
		return ticketsRegistrados;
	}

	public void setTicketsRegistrados(Ticket[] ticketsRegistrados) {
		this.ticketsRegistrados = ticketsRegistrados;
	}


	//toString
	@Override
	public String toString() {
		return "CrudTicket [ticketsRegistrados=" + Arrays.toString(ticketsRegistrados) + "]";
	}
	
	
}
