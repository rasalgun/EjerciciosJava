import java.util.*;

public class Main {
	
	static int op = 1, in = 3, re = 2, c = 1;
	public static void main(String[] args){
		int n = 0, acumulado = 0;
		String resp = "";
		 Scanner sc = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in);
		Pregunta listPregunta[] = new Pregunta[16];
		
		System.out.println("-------------------------------------------------------");
		System.out.println("-HAS ENTRADO AL CONCURSO DE QUIERO SER MILLONARIO     -");
		System.out.println("-DEBERAS DE RESPONDER 15 PREGUNTAS                    -");
		System.out.println("-                TIENES 3 INTENTOS                    -");
		System.out.println("-             PODRAS OMITIR UNA PREGUNTA              -");
		System.out.println("-------------------------------------------------------");
		
		// GENERAR PREGUNTAS
		preguntas(listPregunta); 
		inputRespuesta(listPregunta, n, resp, sc, acumulado,sc1);
	}
	
	public static void preguntas(Pregunta listPregunta[]) {
		
		// ENUNCIADO, 1º OPCION, 2º OPCION, 3º OPCION, 4º OPCION, RESPUESTA CORRECTA, CANTIDAD GANADA
		
		listPregunta[1] = new Pregunta("Significado de la siglas EGB", "A: Educación General Básica", "B: Estado General Bienestar", "C: Estudio General del Balance", "D: Espacio General Deportivo", "a", 100); // inicializamos desde el primer objeto por un problema tecnico, posiblemente lo optimicemos
		listPregunta[2] = new Pregunta("De que esta hecha la horchata de Valencia", "A: Pistacho", "B: Trufa", "C: Arroz", "D: Chufa", "d", 250);	
		listPregunta[3] = new Pregunta("Quien de estas actrices era Rachel en Friends", "A: Jennifer Aniston", "B: Courteney Cox", "C: Lisas Kudrow", "D: Reese Witherspoon", "a", 500);
		listPregunta[4] = new Pregunta("Quienes eran Los Tres Tenores", "A: Pavarotti, Domingo y Carreras", "B: Pavarotti, Domingo y Bocelli", "C: Pavarotti, Domingo y Caruso", "D: Pavarotti, Domingo y Kaufmann", "b", 750);
		listPregunta[5] = new Pregunta("Cuál es la operación a esta operacion: 50+50x0-1", "A: -100", "B: -1", "C: 0", "D: 49", "d", 1500);
		listPregunta[6] = new Pregunta("Quien interpretó la canción oficial del mundial de fútbol de 2010 celebrado en Sudafrica", "A: shakira", "B: Bob Marly", "C: David Bisbal", "D: Pavaroty", "a", 2500);
		listPregunta[7] = new Pregunta("De qué comunidad autónoma fue presidente José Maria Aznar anes de gobernar España", "A: Castilla la Mancha", "B: Castilla y Leon", "C: Andalucia", "D: Madrid", "b", 5000);
		listPregunta[8] = new Pregunta("Quién fue el primero en recibir un premio Nobel de Literatura", "A: Albert Enstain", "B: Eduardo Saenz Cabezon", "C: Nobel", "D: Mary Cury", "a", 10000);
		listPregunta[9] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 15000);
		listPregunta[10] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 20000);
		listPregunta[11] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 30000);
		listPregunta[12] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 50000);
		listPregunta[13] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 100000);
		listPregunta[14] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 300000);
		listPregunta[15] = new Pregunta("¿Con qué letra comienza la palabra del tomo 21 de la Enciclopedia Espasa?", "A: a", "B: s", "C: q", "D: q", "s", 1000000);
	}
	
	public static void inputRespuesta(Pregunta listPregunta[], int n, String resp, Scanner sc, int acumulado, Scanner sc1) { // Metodo para listar las preguntas
		System.out.println("-Responde con cuidado las siguientes preguntas-");

	do {
		n++;
		// LLAMAMOS A LA FUNCION TOSTRING, NOS MOSTRARA EL ENUNCIADO Y POSIBLES RESPUESTAS DE LA PREGUNTA
		System.out.println(listPregunta[n].toString()); 
		if(re == 2) {
			// IMPRIME EL MENU DE OMITIR LA PREGUNTA
			omitir(sc1);		 
		}
		// IMPRIMIMOS EL MENU SIEMPRE QUE TENGA EL CONTADOR C = 1, EN EL MOMENTO DE UTILIZACION C = 0 Y  DEVOLVERA FALSE Y DEJARA DE IMPRIMIR EL MENU
		if(om()) { 
			// SI ES IGUAL A 1 CAMBIA A LA SIGUIENTE PREGUNTA
			if(re == 1) { 
				// INCREMENTA EN 1 EL INDICE PARA PASAR A LA SIGUIENTE PREGUNTA
				n++; 
				// IMPRIME LA SIGUIENTE PREGUNTA
				System.out.println(listPregunta[n].toString()); 
			}
		}
		System.out.print("Elige una respuesta_ ");
		resp = sc.nextLine();
		if(resptrue(n, listPregunta, resp)) {
			System.out.println("HAS ACERTADO");
			System.out.println("Bote acumulado: " + acumPrem(listPregunta, n, acumulado)); // llamamos a la función que acumula el dinero
			// LLAMAMOS AL METODO QUE IMPRIME EL MENU PARA PLANTARSE
			menuPlantarse(sc1); 	
		}else {
			in--;
			System.out.println("HAS FALLADO, aun asi eres un crack");
			System.out.println("Te quedan: " + in + " intentos");
			if(in == 0) {
				System.out.println("Te has quedado sin vidas");
			}
		}
		// SI PULSA 2 DEVUELVE FALSE Y ACTIVA EL IF ROMPIENDO EL BUCLE
		if(salir() == false) { 

			break;
		}
		if(n == 5) {
			in++;
			System.out.println("Has recuperado una vida");
		}
	} while ( n < 14 && in != 0 );
		
	
	}
	
	// COMPROBAR QUE LOS DATOS INTRODUCIDO SON CORRECTOS, SOLO PARA DATOS TIPOS STRING
	public static boolean resptrue(int n, Pregunta listPregunta[], String resp) { 
		boolean continu;
		// COMPROBAMOS SI ES CIERTA CON EL PARAMETRO GETLTRUE
		if(resp.equalsIgnoreCase(listPregunta[n].getltrue())) { 
			continu = true;
		}else {
			continu = false;
		}
		return continu;
	}
	
	// ACUMULADOR DE DINERO DE CADA PRUEBA, EN CADA REITERACION LA PASAMOS POR PARAMETROS EL INDICE DEL OBJETO QUE QUEREMOS ACUMULAR
	public static int acumPrem(Pregunta listPregunta[], int n, int acumulado) { 
		acumulado = listPregunta[n].getvalor() + acumulado;
		return acumulado; 		
	}
	
	// MENU DE PLANTARSE 
	public static void menuPlantarse(Scanner sc1) { 
		System.out.println("Deseas seguir jugando_" + "\n" + "1.SÍ" + "\n" + "2.NO");
		op = sc1.nextInt();
	}
	
	// NOS DEVOLVERA TRUE O FALSE EN FUNCION DE SI SE PLANTA O NO, SOLO PARA DATOS TIPOS INT
	public static boolean salir() { 
		if(op == 1) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static void omitir(Scanner sc1) {
		System.out.println("¿Quieres omitir esta pregunta?");
		System.out.println("1.SÍ");
		System.out.println("2.NO");
		re = sc1.nextInt();
	}
	
	public static boolean om() {
		if(re == 1 && c == 1) {
			return true;
		}else{
			return false;
		}
		
	}
}
