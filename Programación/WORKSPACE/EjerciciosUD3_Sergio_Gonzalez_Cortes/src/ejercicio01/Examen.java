package ejercicio01;

public class Examen {
	
	//Atributos
	
	private String asignatura;
	private int aula;
	private String fecha;
	
	
	//Constructor
	
	public Examen (String asignatura, int aula, String fecha) {
		
		this.asignatura = asignatura;
		this.aula = aula;
		this.fecha = fecha;
	
	}
	
	
	//Acciones
	
	public void imprimirCabecera () {
		
		System.out.println("-------------------------------------------");
		System.out.println("Asignatura: "+ asignatura+ "\t\t");
		System.out.print("Aula: "+ aula);
		System.out.println("\t\t\tFecha: "+ fecha);
		System.out.println("-------------------------------------------");
	}
	
	

}
