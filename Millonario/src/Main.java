import java.util.*;

public class Main {
	
	static int op = 0;
	public static void main(String[] args){
		int n = 0, acumulado = 0;
		String resp = "";
		 Scanner sc = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in);
		Pregunta listPregunta[] = new Pregunta[16];
		
		System.out.println("-------------------------------------------------------");
		System.out.println("-HAS ENTRADO AL CONCURSO DE QUIERO SER MILLONARIO     -");
		System.out.println("-DEBERAS DE RESPONDER 15 PREGUNTAS Y NO FALLAR NINGUNA-");
		System.out.println("-------------------------------------------------------");
		
		preguntas(listPregunta); // generar preguntas
		inputRespuesta(listPregunta, n, resp, sc, acumulado,sc1);
	}
	
	public static void preguntas(Pregunta listPregunta[]) {
		// enunciado, 1º opcion , 2º opocion, 3º opcion, 4º opcion, respuesta correcta, cantidad ganada
		listPregunta[1] = new Pregunta("Significado de la siglas EGB", "A: Educación General Básica", "B: Estado General Bienestar", "C: Estudio General del Balance", "D: Espacio General Deportivo", "a", 100);
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
		System.out.println(listPregunta[n].toString()); // llamamos a la función toStrin, nos mostrará el enunciado y posibles respuestas de la pregunta
		System.out.print("Elige una respuesta_ ");
		resp = sc.nextLine();
		if(resptrue(n, listPregunta, resp)) {
			System.out.println("HAS ACERTADO");
			System.out.println("Bote acumulado: " + acumPrem(listPregunta, n, acumulado)); // llamamos a la función que acumula el dinero
			menuPlantarse(sc1); // llamamos al metodo que imprime el menu para plantarse	
		}else {
			System.out.println("HAS FALLADO, aun asi eres un crack");
			System.out.println("HAS GANADO 0 PAVOS");
		}
		
	} while (n < 14 && resptrue(n, listPregunta, resp) && salir());
		
	
	}
	
	public static boolean resptrue(int n, Pregunta listPregunta[], String resp) { // comprobar que los datos introducidos son correctos, solo para datos tipo STRINGS
		boolean continu;
		if(resp.equalsIgnoreCase(listPregunta[n].getltrue())) { // comprobamos si es cierta con el parametro getltrue
			continu = true;
		}else {
			continu = false;
		}
		return continu;
	}
	
	public static int acumPrem(Pregunta listPregunta[], int n, int acumulado) { // acumulador de dinero de cada prueba, en cada reitaración le pasamos por parametros el indice del objeto que queremos acumular
		acumulado = listPregunta[n].getvalor() + acumulado;
		return acumulado; 		
	}
	
	public static void menuPlantarse(Scanner sc1) { // menu de plantarse
	
		System.out.println("Deseas seguir jugando_" + "\n" + "1.SÍ" + "\n" + "2.NO");
		op = sc1.nextInt();
	
	}
	
	public static boolean salir() { // nos devolverá true o false en función de si se planta o no, solo para datos tipos INT
		if(op == 1) {
			return true;
		}else {
			return false;
		}		
	}
}
