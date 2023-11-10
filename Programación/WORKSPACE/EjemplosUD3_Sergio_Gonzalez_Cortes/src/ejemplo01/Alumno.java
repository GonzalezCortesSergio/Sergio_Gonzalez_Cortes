package ejemplo01;

public class Alumno {
	
	//Atributos
	
	private String nombre;
	int edad;
	private double notaMedia;
	
	
	
	//(EN LAS CLASES QUE DEFINEN DISTINTOS VALORES NO PUEDEN TENER UNA VARIABLE CON VALORES APLICADOS)
	
	
	//Constructores
	
	//(Para crear un objeto con valores)
	
	//(Lo que se encuentra dentro del paréntesis es llamado parámetro o argumento)
	
	public Alumno (String nombre, int edad, double notaMedia) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	
		
	}
	
	
	
	public Alumno (String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	
	public Alumno() {
		
		
	}
	
	
	
	
	
	
	//Métodos
	
	
	//(Primer método propio, para imprimir en bonito)
	
	//(Donde antes estaba xxx debe ir el criterio de devolución, en los paréntesis deben estar los atributos añadidos.
	//las llaves marcan el cuerpo, los nombres deben empezar en minúscula y si es compuesta, la segunda palabra en mayúscula.)
	
	public void mostrarDatos (String calle){
		
		//Cuerpo
		
		System.out.println("Los datos del alumno son:");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Nota media: "+ notaMedia);
		System.out.println("Calle: "+ calle);
	}


}
