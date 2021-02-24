
import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int n = 0, edad, peso, altura;
	static double salario;
	static String nombre, dni, profesion;
	static char sexo;
	
			
	public static void main(String[]args) {
		
		System.out.println("Bienvenido al programa de gestión personal de ventas");
		System.out.println("--------------------------------------------");
		System.out.println("Introduce el número de personal de ventas");
		System.out.println("--------------------------------------------");
		n = sc.nextInt();
		System.out.println("--------------------------------------------");
		
		Persona listpersona [] = new Persona[n+1];
		
	}
	
	public static void añadirPersonal(Persona listpersona[]) {
		
		for (int i = 1; i < listpersona.length; i++) {
			System.out.println("--------------------");
			System.out.println("-Añadir cliente " + (i)+ "º-");
			System.out.println("--------------------");
			System.out.println("Para darse de alta debe de indicar su nombre_");
		    nombre = sc.next();
	
					// SE UTILIZA EL CONSTRUCTOR QUE TIENE LOS PARAMETROS NOMBRE Y SALDO
			System.out.println("introduce una edad:_");
			edad = sc.nextInt();
			System.out.println("introduce un DNI:_");
			dni = sc.next();	
			System.out.println("introduce un sexo (H) o (M):_");
			sexo = sc.next().charAt(0);	
			System.out.println("introduce una profesion:_");
			profesion = sc.next();	
			System.out.println("introduce un salario:_");
			salario = sc.nextInt();	
			System.out.println("introduce un peso:_");
			peso = sc.nextInt();	
			System.out.println("introduce una altura:_");
			altura = sc.nextInt();	
			
			
					listpersona[i] = new Persona(nombre, edad, dni, sexo, profesion, salario, peso, altura); 
					
				}
		}
	
	public static void calcularIMC(Persona listpersona[]) {
		
		for (int i = 1; i < listpersona.length; i++) {
			int IMC;
			
		}
	}
}
