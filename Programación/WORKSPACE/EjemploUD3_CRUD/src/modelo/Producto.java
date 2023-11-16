package modelo;

public class Producto {

	
	//Atributo 
	
	private String codigo;
	private String nombre;
	private double precioUnitario;
	private boolean activo;
	
	
	//Constructor
	
	public Producto (String codigo, String nombre, double precioUnitario, boolean activo ) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
		
	}

	
	//Getters and Setters

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	

	
	//To String 
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", activo="
				+ activo + "]";
	}
	
	
	
	
}
