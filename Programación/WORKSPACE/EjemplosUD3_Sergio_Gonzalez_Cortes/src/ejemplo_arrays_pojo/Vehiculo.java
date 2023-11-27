package ejemplo_arrays_pojo;

public class Vehiculo {

	
	private double potencia;
	private String modelo;
	
	
	public Vehiculo (double potencia, String modelo) {
		
		this.potencia = potencia;
		
		this.modelo = modelo;
	}


	public double getPotencia() {
		return potencia;
	}

	
	//Getters and Setters

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Vehiculo [potencia=" + potencia + ", modelo=" + modelo + "]";
	}
	
	
	

}
