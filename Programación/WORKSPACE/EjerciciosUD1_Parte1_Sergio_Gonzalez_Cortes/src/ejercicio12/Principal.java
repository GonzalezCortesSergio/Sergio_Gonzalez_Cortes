package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		
		String empleado= ("John Snow");
		double cocacola= 1.20;
		double pipas= 0.40;
		double garra= 150;
		double precio= 0;
		double preciocant1= 0;
		double preciocant2= 0;
		double preciocant3= 0;
		double preciofinal= 0;
		double cantidad= 0;
		String producto1= ("COCACOLA");
		String producto2= ("PIPAS");
		String producto3= ("GARRA");
		String fecha= ("2/10/2023");
		String hora= ("10:54");
		
		System.out.printf("\nTIENDA MANOLITO \t %s\n",fecha);
		System.out.printf("\t \t \t %s\n", hora);
		
		System.out.println("-----------------------------------------");
		
		System.out.printf("Le ha atendido %s \n", empleado);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("PRODUCTO	CANTIDAD	PRECIO");
		
		precio= cocacola;
		cantidad= 4;
		preciocant1= precio*cantidad;
		
		System.out.printf("%s	%.0f		%.2f €\n",producto1,cantidad,preciocant1 );
		
		precio= pipas;
		cantidad= 1;
		preciocant2= precio*cantidad;
		
		System.out.printf("%s		%.0f		%.2f €\n", producto2,cantidad, preciocant2);
		
		precio= garra;
		cantidad= 1;
		preciocant3= precio*cantidad;
		
		System.out.printf("%s		%.0f		%.2f €\n",producto3, cantidad, preciocant3);
		
		preciofinal=preciocant1+preciocant2+preciocant3;
		
		System.out.printf("\nTOTAL				%.2f €\n",preciofinal);
		System.out.println("-----------------------------------------");
		
		System.out.println("\nGRACIAS POR SU VISITA");
		
		
		
		
	}

}
