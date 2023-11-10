package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		float precioinicial=2.55f;
		float descuento=0;
		float preciofinal=0;
		// TODO Auto-generated method stub
		System.out.println("Bienvenido, vamos a comprobar el "
				+ "descuento del 20 por ciento de 3 kilos de melón.");
		descuento= (precioinicial*20/100);
		preciofinal= (precioinicial-descuento);
		System.out.printf("Un descuento en el precio de 3 kg"
				+ " de melón del 20 por ciento supondrá que valga %.2f euros", preciofinal);
	}

}
