
import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Bienvenido al programa de gestión personal de ventas");
		System.out.println("--------------------------------------------");
		System.out.println("Introduce el número de personal de ventas");
		System.out.println("--------------------------------------------");
		n = sc.nextInt();
		System.out.println("--------------------------------------------");
		
		Persona listpersona [] = new Persona [n];
		
		listpersona=añadirPersonal(listpersona,sc);
	
		
		listpersona[0].calcularIMC(listpersona[0].getPeso(), listpersona[0].getAltura());
		listpersona[1].calcularIMC(listpersona[1].getPeso(), listpersona[1].getAltura());
		listpersona[2].calcularIMC(listpersona[2].getPeso(), listpersona[2].getAltura());
		
		listpersona[0].esMayorDeEdad(listpersona[0].getEdad());
		listpersona[1].esMayorDeEdad(listpersona[1].getEdad());
		listpersona[2].esMayorDeEdad(listpersona[2].getEdad());
		
		listpersona[0].esMileurista((int) listpersona[0].getSalario());
		listpersona[1].esMileurista((int) listpersona[1].getSalario());
		listpersona[2].esMileurista((int) listpersona[2].getSalario());
		
		listpersona[0].toString();
		listpersona[1].toString();
		listpersona[2].toString();
	}
	
	public Persona[] añadirPersonal(Persona listpersona[], Scanner sc) {
		int edad, peso, altura;
		double salario;
		String nombre, dni, profesion;
		char sexo;
		
		for (int i = 1; i < listpersona.length; i++) {
			System.out.println("--------------------");
			System.out.println("-Añadir personal " + (i)+ "º-");
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
		return listpersona;
		}
	
		
		
}
