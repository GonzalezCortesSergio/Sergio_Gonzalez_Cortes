package ejemplo02;

public class Alumno {

	//Atributos
	
	
	private String nombre;
	private double notaProg;
	private double notaBD;
	
	
	//Constructor
	
	public Alumno(String nombre, double notaProg, double notaBD) {
		
		this.nombre = nombre;
		this.notaProg = notaProg;
		this.notaBD = notaBD;
		
	}
	
	
	//Métodos
	
	public double calcularNotamedia () {
		
		double suma, media;
		double dos= 2;
		suma= notaProg+notaBD;
		media= suma/dos;
		return media;
		
	//(Sólo se escribe return cuando el public no es void. Además que debe estar en la última línea del cuerpo del método)
	}
	
	public void mostrarNotamedia (double media) {
		
		System.out.println("Bienvenido "+ nombre);
		System.out.println("Su nota media total es de: "+ media);
	}
}
