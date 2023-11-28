package ejercicio01;

public class Producto {

	//Atributos
	
	private double precioFabrica;
	private double porCosTransporte;
	private String nombreProducto;
	private String codigoProducto;
	private boolean fragil;
	
	
	//Constructor
	public Producto(double precioFabrica, double porCosTransporte, String nombreProducto, String codigoProducto,
			boolean fragil) {
		
		
		this.precioFabrica = precioFabrica;
		this.porCosTransporte = porCosTransporte;
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.fragil = fragil;
	}


	
	//Setters and Getters
	
	public double getPrecioFabrica() {
		return precioFabrica;
	}


	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public double getPorCosTransporte () {
		return porCosTransporte;
	}
	
	public void setPorCosTransporte (double porCosTransporte) {
		
		this.porCosTransporte = porCosTransporte;
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
				+ codigoProducto+ ", fragil=" + fragil + "]";
	}
	
	
	
	//Métodos
	
	public double calcularPCoste () {
		
		int cien = 100;
		
		
		return (precioFabrica*porCosTransporte) /  cien;
	}
	
	
	
	
	
	
}
