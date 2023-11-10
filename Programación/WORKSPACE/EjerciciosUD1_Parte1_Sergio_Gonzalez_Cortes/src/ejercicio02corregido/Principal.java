package ejercicio02corregido;

public class Principal {

	public static void main(String[] args) {
		double largopisoli= 50.0, anchopisoli= 21.0, profpisoli= 2.50, volpisoli= 0.0;
		double radiopiscirc= 12.0, profpiscir=1.80, exp= 2, volpiscir= 0.0;
		double precioagua= 1.80, costepisoli= 0.0, costepiscir= 0.0;
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("		Bienvenido al programa para calcular el volumen de una piscina");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("  ");
		
		volpisoli= largopisoli*anchopisoli*profpisoli;
		
		System.out.printf("El volumen de la piscina olímpica es de %.2f metros cúbicos \n", volpisoli);
		
		costepisoli=precioagua*volpisoli;
		
		System.out.printf("El coste de llenar la piscina olímpica es de %.2f euros \n", costepisoli);
		
		System.out.println("  ");
		System.out.println("*************************************************************************************************");
		
		volpiscir= Math.PI*Math.pow(radiopiscirc, exp)*profpiscir;
		
		System.out.println("  ");
		
		System.out.printf("El volumen de la piscina circular es de %.2f metros cúbicos\n",volpiscir);
		
		System.out.println("  ");
		
		costepiscir= volpiscir*precioagua;
		
		System.out.printf ("El coste de llenar la piscina circular es de %.2f euros\n", costepiscir);
		
		System.out.println("Gracias por usar el programa");
		
		
	}

}
