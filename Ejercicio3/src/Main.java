
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
			
		for(int i=0;i<listpersona.length;i++) {
			System.out.println(" Estas son las comprobaciones para esta persona: " + listpersona[i].getNombre());
			System.out.println("----------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Comprobar IMC");
			System.out.println(Persona.calcularIMC(listpersona[i].getPeso(), listpersona[i].getAltura()));
			System.out.println("----------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Comprobar si es mayor de edad");
			System.out.println(Persona.esMayorDeEdad(listpersona[i].getEdad()));
			System.out.println("----------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Comprobar si es mileurista");
			System.out.println(Persona.esMileurista((int) listpersona[i].getSalario()));
			System.out.println("----------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Comprobar sexo de la persona");
			System.out.println(Persona.comprobarSexo(listpersona[i].getSexo()));
			System.out.println("----------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(listpersona[i]);
		}
		
	}
	
	public static Persona[] añadirPersonal(Persona listpersona[], Scanner sc) {
		int edad, peso, altura;
		double salario;
		String nombre, dni, profesion;
		char sexo;
		
		for (int i = 0; i < listpersona.length; i++) {
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
