package ejercicio01;

public class Producto {

	//Atributos
	
	private double precioFabrica;
	private String nombreProducto;
	private String codigoProducto;
	private String seccionProducto;
	private boolean fragil;
	
	
	//Constructor
	public Producto(double precioFabrica, String nombreProducto, String codigoProducto, String seccionProducto,
			boolean fragil) {
		
		
		this.precioFabrica = precioFabrica;
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.seccionProducto = seccionProducto;
		this.fragil = fragil;
	}


	
	//Setters and Getters
	
	public double getPrecioFabrica() {
		return precioFabrica;
	}


	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getSeccionProducto() {
		return seccionProducto;
	}


	public void setSeccionProducto(String seccionProducto) {
		this.seccionProducto = seccionProducto;
	}


	public boolean isFragil() {
		return fragil;
	}


	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}



	
	//To string
	
	
	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", nombreProducto=" + nombreProducto + ", codigoProducto="
				+ codigoProducto + ", seccionProducto=" + seccionProducto + ", fragil=" + fragil + "]";
	}
	
	
	
	//Métodos
	
	public double calcularPCoste (double porCosTransporte) {
		
		int cien = 100;
		
		
		return (precioFabrica*porCosTransporte) /  cien;
	}
	
	
	
	
	
	
}
