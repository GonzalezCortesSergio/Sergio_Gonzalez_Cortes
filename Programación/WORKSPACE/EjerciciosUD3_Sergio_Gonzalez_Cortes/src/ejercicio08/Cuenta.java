package ejercicio08;

public class Cuenta {

	
	
	//Atributos
	
	private double saldo;
	private String nombreTitular;
	
	//Constructor
	public Cuenta(double saldo, String nombreTitular) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}

	
	//Getters and Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	
	//Métodos
	
	public void ingresarDinero (double dinero) {
		
		saldo = saldo+dinero;
		
		//En este caso no haría falta devolver saldo porque no se pide
		//Por lo que en lugar de crear un método "double", se podría
		//crear un método "voide para ello
	}
	
	
	
	
	public void retirarDinero (double dinero) {
		
			saldo = saldo-dinero;
		
			//En este caso no haría falta devolver saldo porque no se pide
			//Por lo que en lugar de crear un método "double", se podría
			//crear un método "voide para ello
	}
	
	public double pasarADolares (double valorDolar) {
		
		double saldoDolares;
		
		saldoDolares = saldo/valorDolar;
		
		return saldoDolares;
	}
	
	/* public void mostrarValorDolares (double valorDolar) {
		
		double saldoDolares;
		
		saldoDolares = pasarADolares(valorDolar);
		
		System.out.printf("%.2f $\n", saldoDolares);
		
		ESTE MÉTODO SOBRA
	}*/
	
	public void consultarSaldo () {
		
		System.out.printf("%.2f €\n", saldo);
	}
	
	
	
	
	
}
