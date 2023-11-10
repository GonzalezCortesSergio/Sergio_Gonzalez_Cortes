package programa;

import java.util.Random;

import utilidades.Leer;

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
		 * 
		 * 
		 * DIA 2:
		 * 
		 * Hemos dado por hecho que el programa era un lío así que decidimos realizar un programa distinto con el mismo concepto
		 * 
		 * Nos hemos repartido las tareas y Miguel realizará los print y Sergio los cálculos.
		 * 
		 * 
		 * 
		 * DIA 3: 
		 * 
		 * Último día, vamos a hacer todo el programa desde cero.
		 * 
		 * Ocasionalmente hemos ido consultando las ideas entre nosotros y nos hemos corregido.
		 * 
		 * Sergio ha mostrado las opciones positivas y Miguel las negativas
		 * 
		 * (Profe, sabemos que esto es poco profesional; pero menos profesional es mentir).
		 * 
		 */
		
		
		
		//VARIABLES
		String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		int desde= 1, hasta= 100;
		int porcentaje;
		int opcion;
		int numeroaleatorio;
		int diez= 10;
		int cuarenta= 40;
		int eleccion;
		int repetir;
		
		//INICIAR RANDOM
		Random r= new Random(System.nanoTime());
		
		//PRESENTACIÓN
		
		System.out.println("***********************************************************************************************"
				+ "***********************************");
		System.out.println("Bienvenido, este programa le realizará varias preguntas. En función de las opciones que escoja "
				+ "aumentará su probabilidad de morir.");
		System.out.println("***********************************************************************************************"
				+ "***********************************");
		
		do {
			
		
		
		//PREGUNTA 1
		porcentaje= 0;
		
		System.out.println("¿En qué día quiere empezar?");
		System.out.println();
		
		
		System.out.println("-------------------------");
		System.out.println();
		for (int i = 0; i < dias.length; i++) {
			System.out.println("Opción "+ (i+1) +"\t" + dias[i]);
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		opcion= Leer.datoInt();
		
		if (opcion == 5 || opcion == 6 || opcion == 7) {
			
			porcentaje= porcentaje+diez;
			
			System.out.println("");
			
	        System.out.println("Tu probabilidad de morir aumento a un "+porcentaje+ "%, Los fines de semana suelen ser más peligrosos");

			
			
			
			
			
		}
		
		else {
			
			System.out.println("");
			
			System.out.println("Tu probabilidad de morir no ha aumentado. Los días entre semana son más seguros");
			
		}
		
		
		//PREGUNTA 2
		
		System.out.println("Buenos dias, hoy es"+dias[opcion-1]+ "y tenemos un dia muy soleado\t\n"
        		+ "\n"
        		+ "¿Con qué pie empezamos el dia?\t\n"
        		+ "-------------------------------------\t\n"
        		+ "Opción 1: Pie izquierdo\t\n"
        		+ "Opción 2: Pie derecho\t\n");
		
		eleccion= Leer.datoInt();
		
		
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
			System.out.println("");
			
	        System.out.println("Tu probabilidad de morir aumento a un "+porcentaje+ "%, Nunca debes empezar el día con ese pie");

			
			
		}
		
		else {
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. ¡¡Muy bien, escogiste el pie correcto!!");
			
		}
		
		
		//PREGUNTA 3
		
		
		 System.out.println("Después de vestirnos y prepararnos toca ir a desayunar y tenemos leche y cereales solamente(Vida de estudiante)\t\n"
	        		+ "\n"
	        		+ "¿Qué se pone primero la leche o los cereales?\t\n"
	        		+ "-------------------------------------\t\n"
	        		+ "Opción 1: La leche \t\n"
	        		+ "Opción 2: Los cereales\t\n");
		 
		 
		eleccion= Leer.datoInt();
		
		
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
			System.out.println("");
			
			System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, se ve que no eres muy listo...");
			
		}
		
		else {
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. ¡¡VAAAMOOO, PRIMERO LO PRIMERO!!");
			
		}
		
		//PREGUNTA 4
		
		
		 System.out.println("Uff nos hemos entretenido en el desayuno y vamos tarde a  un compromiso, ¡No podemos dar mala imagen!\t\n"
	        		+ "\n"
	        		+ "¿Utilizamos la moto?\t\n"
	        		+ "-------------------------------------\t\n"
	        		+ "Opción 1: Si\t\n"
	        		+ "Opción 2: No\t\n");
		 
		 
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
		
			
			System.out.println("");
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, las prisas son malas consejeras, deberías no haber faltado tanto crack");

		
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. Lo estás haciendo bien");
			
		}
		
		
		//PREGUNTA 5
		
		 System.out.println("Después de nuestro compromiso es hora de ir a comer\t\n"
	        		+ "\n"
	        		+ "¿Qué debería comer?\t\n"
	        		+ "-------------------------------------\t\n"
	        		+ "Opción 1: Un McDonals's \t\n"
	        		+ "Opción 2: Taberna Encarni\t\n");
		 
		 
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
		
			
			System.out.println("");
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, ese colesterol sube como la espuma,deberías cuidar tu alimentación");

		
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. No me puedo sentir más orgulloso de ti");
		
		}
		
		
		//PREGUNTA 6
		
		
		
		System.out.println("Me he pasado comiendo, estaría bien una siesta pero me gustaría también ir al gimnasio \t\n"
        		+ "\n"
        		+ "¿Que debería hacer?\t\n"
        		+ "-------------------------------------\t\n"
        		+ "Opción 1: Ir al gymnsaio, esos biceps no se esculpen solos \t\n"
        		+ "Opción 2: Una buena siesta siempre sienta bien\t\n");
		
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
		
			
			System.out.println("");
		
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, aunque hacer ejercicio esta genial, si te encuentras tan lleno no deberías de hacer deporte, se nota que no fuiste a comer a la playa con tu madre");

		}
		
		else {
			
				
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. Como debe de ser");
		
		}
		
		
		//PREGUNTA 7
		
		System.out.println("Ya son las 7 de la tarde, y de camino a casa olvidas que habias quedado para ver a tu abuela\t\n"
        		+ "\n"
        		+ "¿Vas a visitarla?\t\n"
        		+ "-------------------------------------\t\n"
        		+ "Opción 1: No, mejor otro día\t\n"
        		+ "Opción 2: Si, llevamos tiempo sin verla\t\n");
		
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
		
			System.out.println("");
			
			System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, se buen nieto y visita a tu abuela, ya me lo agradeceras");
			
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. Tu abuela estará encantada de verte");
		
		}
		
		
		
		//PREGUNTA 8
		
		System.out.println(" De camino a casa he mirado por el grupo de la clase, han quedado para jugar a los bolos\t\n"
        		+ "\n"
        		+ "¿Debería apuntarme al plan?\t\n"
        		+ "-------------------------------------\t\n"
        		+ "Opción 1: No, me gusta ir más a mi rollo\t\n"
        		+ "Opción 2: Si, se ven buena gente\t\n");
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
			
			System.out.println("");
		
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, todos necesitamos socializar de vez en cuando, ¡Sal de tu zona de confort! ");

		
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. Lo más probable es que hagas grandes amigos");
		
		}
		
		//PREGUNTA 9
		
		System.out.println("Por fin estamos en casa, pero se me olvido tirar la basura, de camino al contenedor escuchamos un ruido extraño, al parecer alguien pide ayuda a gritos\t\n"
        		+ "\n"
        		+ "¿Debería ayudar?\t\n"
        		+ "-------------------------------------\t\n"
        		+ "Opción 1: Si, podría estar en peligro\t\n"
        		+ "Opción 2: No, me voy a meter en problemas\t\n");
		
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
			
			System.out.println("");
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, se nota que eres buena persona, a veces la peor opción para uno mismo es la correcta ");

		
		
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. Triquitrácatelas, hay que sobrevivir colega");
		
		}
		
		
		//PREGUNTA 10
		
		 System.out.println("Estabas a punto de dormirte, suena el telefonó es tu mejor amigo Jordan, te dice que a las 3 de la mañana van a ir a una discoteca en el polígono calongue, el ambiente es algo raro ya que va a ir bad bunny como artista invitado \t\n"
	        		+ "\n"
	        		+ "¿Debería ir a la fiesta ?\t\n"
	        		+ "-------------------------------------\t\n"
	        		+ "Opción 1: Ir a ver a Bad bunny\t\n"
	        		+ "Opción 2: Quedarse en casa descansando\t\n");
		 
		 
		
		eleccion= Leer.datoInt();
		
		if (eleccion == 1) {
			
			porcentaje= porcentaje+diez;
		
			
			System.out.println("");
			
	        System.out.println("Tu probailidad de morir a aumentado en un "+porcentaje+"%, es peligroso ir a sitios tan concurridos y con poca seguridad, además te vas a levantar con una resaca de tres pares. Espero que haya valido la pena el concierto.  ");

		
		}
		
		else {
			
			
			
			System.out.println("");
			System.out.println("Tu probabilidad de morir no ha aumentado. A mimir");
		
		}
		
		
		
		
		
		
		
		//RESULTADO
		
		
		System.out.println();
		
		
		System.out.println("**********************************************");
		System.out.println();
		numeroaleatorio= r.nextInt(hasta-desde)+desde;
		
		if (numeroaleatorio <= porcentaje) {
			
			
			System.out.println("");
			System.out.println("Has tenido un porcentaje de morir de "+porcentaje+ "% y la has cascado en alguno de los momentos que has pasado y ni te has dado cuenta, para eso no haberte levantado");
		}
		
		else if (porcentaje > cuarenta){
			
			
			System.out.println("");
			System.out.println("Has tenido un porcentaje de morir de "+porcentaje+"% y has sobrevivido, vaya flor en el culo tienes. ");
		}
		
		else {
			
			
			System.out.println("");
			System.out.println("Has sobrevivido, otro día más en el que sobrevives. ¡¡Enhorabuena!!");
		}
		
		
		System.out.println("");
		System.out.println("¿Quieres volver a realizar el cuestionario?");
		
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("Opcion 1:\t\t Sí");
		System.out.println("Opcion 0:\t\t No");
		System.out.println("---------------------------");
		
		repetir= Leer.datoInt();
		
		}while (repetir != 0);
		
		//DESPEDIDA
		System.out.println();
		
		System.out.println("********************************");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("********************************");

	}

}
