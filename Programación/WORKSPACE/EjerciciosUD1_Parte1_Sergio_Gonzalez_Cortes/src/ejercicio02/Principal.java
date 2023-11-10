package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		double largopo=50;
		double anchopo=21;
		double profpo=2.50;
		double radpc=12;
		double profpc=1.80;
		double volumenpo=0;
		double volumenpc=0;
		double preciopo=0;
		double preciopc=0;
		
		System.out.println("Bienvenido, vamos a realizar el "
				+ "cálculo del volumen de dos piscinas");
		volumenpo= largopo*anchopo*profpo;
		volumenpc= 3.14*profpc*(radpc*radpc);
		System.out.println("El volumen de la piscina "
				+ "olímpica es de: "+volumenpo+ " metros");
		System.out.println("El volumen de la piscina "
				+ "circular es de "+volumenpc+ " metros");
		System.out.println("Teniendo en cuenta que el metro "
				+ "cúbico de agua cuesta 1,80€");
		preciopo= volumenpo*1.80;
		preciopc= volumenpc*1.80;
		
		System.out.println("Llenar la piscina olímpica"
				+ " costará " +preciopo+ "€");
		System.out.println("Llenar la piscina circuar"
				+ " costará " +preciopc+ "€");
		

	}

}
