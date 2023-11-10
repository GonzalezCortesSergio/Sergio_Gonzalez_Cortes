package programa;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * COMENTARIOS:
		 * 
		 * DÍA 1:
		 * 
		 * Hemos repartido las tareas y Miguel al principio ha estado haciendo el test que
		 * hicimos el otro día.
		 * 
		 * Sergio ha estado creando los array, introduciendo los datos del array e introduciendo la presentación del programa
		 * 
		 * Miguel ha empezado con la estructura del menú y ha empezado a crear la opción 1
		 */
		
		
		//VARIABLES
		int probabilidades [] = {30, 46, 48, 45, 56};
		int probabilidadesalt[]= {90, 85, 95, 70, 75};
		String casos []= {"Atropello", "Apuñalamiento", "Envenenamiento", "Accidente de avión", "Caída desde un 4º Piso" };
		int desde= 1 , hasta= 100;
		int numeroaleatorio;
		
		//INICIAR RANDOM
		Random r= new Random(System.nanoTime());
		
		//INICIALIZAR ARRAYS
		
		
		
		//SALUDO
		System.out.println("*************************************************************"
				+ "***************************************************************************");
		System.out.println("Bienvenido, este programa le pondrá en una de las situaciones"
				+ " de riesgo que elija y le dirá si se muere o no en función de su porcentaje");
		System.out.println("*************************************************************"
				+ "***************************************************************************");
		
		//MENÚ
		
		
		//	OPCION1
		for (int i = 0; i < casos.length; i++) {
			
			System.out.print("\t"+casos[i]+"\t");
		}
		
		System.out.println();
		
		System.out.print("El conductor iba a menos de 30 km/h:\t");
		System.out.print(probabilidades[0]+"%\n");
		
		System.out.print("El conductor iba a más de 50 km/h:\t");
		
		System.out.print(probabilidadesalt[0]+"%\n");
		
		//eleccion 1 
		
		numeroaleatorio= r.nextInt(hasta-desde)+desde;
		
		if (numeroaleatorio <= probabilidades[0]) {
			
			System.out.println("Te has muerto");
		}
		
		else {
			System.out.println("Has sobrevivido");
			
		}
		}

}
