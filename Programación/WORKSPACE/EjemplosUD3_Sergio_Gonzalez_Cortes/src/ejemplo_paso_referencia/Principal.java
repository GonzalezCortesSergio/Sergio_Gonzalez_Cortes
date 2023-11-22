package ejemplo_paso_referencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaAct, mesAct;
		String aux;
		
		Scanner s = new Scanner(System.in);
		
		Fecha nacimiento = new Fecha (8, 07, 1976); 
		
		Fecha contratacion = new Fecha (17, 10, 2004);
		
		/*Al necesitar de las clases nacimiento y contratación para la clase
		 * empleado. Debo instanciar primero las dos anteriores; ya que sino
		 * sus valores pasarán a encontrarse con valor nulo*/
		Empleado empleado = new Empleado ("Ángel", "Naranjo", nacimiento,
				contratacion);
		
		System.out.println(empleado);
		
		System.out.println("Qué día es hoy");
		
		aux = s.nextLine();
		
		diaAct = Integer.parseInt(aux);
		
		System.out.println("¿Qué mes?");
		
		aux = s.nextLine();
		
		mesAct = Integer.parseInt(aux);
		
		Fecha actual = new Fecha (diaAct, mesAct);
		
		empleado.felicitarCumple(actual);
		
		System.out.println(empleado);
		
		System.out.println("****************");
		
		empleado.rejuvenecer(nacimiento);
		
		System.out.println(empleado);
		
		/*
		 * Compara con el paso por copia
		 * 
		 * int a=2;
		 * 
		 * Numero miNumero = new Numero();
		 * 
		 * 
		 * System.out.println(miNumero.modificar(a)); //Cambia la copia, vale 6
		 * 
		 * 
		 * miNumero.mostrar(a);//El a del main no ha cambiado, vale 2
		 */
	}

}
