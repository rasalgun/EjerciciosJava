
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
		
		añadirPersonal(listpersona);
		System.out.println(calcularIMC(peso,altura));
		System.out.println(esMayorDeEdad(edad));
		System.out.println(comprobarSexo(sexo));
		System.out.println(listpersona);
		
	}
	
	public static void añadirPersonal(Persona listpersona[]) {
		
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
		}
	
		public static int calcularIMC(int peso, int altura) {
			int resul = 0;
				double imc;
				imc = peso/Math.pow(altura, 2);
				if(imc<20) {
					resul = -1;
				} else if (imc <= 20 && imc <= 25) {
					resul = 0;
				} else if (imc > 25) {
					resul = 1;
				}
				return resul;
			}
		
		public static boolean esMayorDeEdad(int edad) {
			boolean resul = false;
			if(edad<18) {
				resul = false;
			} else if (edad > 18) {
				resul = true;
			} 
			return resul;
		}
	
		public static String comprobarSexo(char sexo) {
			char H=sexo,M=sexo;
			String error;
			if(sexo==H && sexo==M) {
				error = "Si es un valor valido";
			} else { 
				error = "No es un valor valido";
			}
			return error;
		}
		
		public static boolean esMileurista(int salario) {
			boolean resul = false;
			if(salario<1000) {
				resul = false;
			} else if (salario>1000) {
				resul = true;
			} 
			return resul;
			
		}
		
		
		
}
