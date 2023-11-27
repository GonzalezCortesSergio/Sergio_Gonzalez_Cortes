package ejemplo_arrays_pojo;

public class Concesionario {

	
	//Atributos
	
	private Vehiculo [] listaVehiculos;
	private int nVs;
	
	
	//Constructor
	public Concesionario (Vehiculo [] listaVehiculos, int nVs) {
		
		this.listaVehiculos = listaVehiculos;
		this.nVs = nVs;
	}

	//Getters and Setters
	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	public int getNvs () {
		
		return nVs;
	}
	
	public void setNvs (int nVs) {
		
		this.nVs = nVs;
	}
	
	
	//Métodos
	public void agregar (Vehiculo v) {
		
		
		
		listaVehiculos[nVs] = v;
		nVs++;
		
	}
	
	public void mostrarEmpepinados (int topePotencia) {
		
		for (int i = 0; i < nVs; i++) {
			
			if (listaVehiculos[i].getPotencia() >= topePotencia) {
				
				System.out.println(listaVehiculos[i].toString());
			}
		}
	}
}
