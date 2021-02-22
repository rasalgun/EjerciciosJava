import java.util.*;

public class Main {
	//piuwegfpiuggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggglocooooooooooooooooo
		static Scanner sc = new Scanner(System.in);
		static int n = 0, op;
		static double saldo, saldoretirar;
		static String titular;
		

		public static void main(String[] args) { // metodo principal
		
		System.out.println("Bienvenido al programa de gestión financiera");
		
		System.out.println("Introduce el número de clientes");
		n = sc.nextInt();
		
		Cuenta listCuenta [] = new Cuenta[n+1]; // Creamos los objetos cuentas en un array

	
		añadirCliente(listCuenta); // añadimos el nombre y el sueldo
		retirarDinero(listCuenta);
		
	}
	
	public static void añadirCliente(Cuenta listCuenta[]) {
		for (int i = 1; i < listCuenta.length; i++) {
			System.out.println("--------------------");
			System.out.println("-Añadir cliente " + (i)+ "º-");
			System.out.println("--------------------");
			System.out.println("Para darse de alta debe de indicar su nombre_");
		    titular = sc.next();
			System.out.println("------------------------------------");
			System.out.println("-Desea ingresar dinero en su cuenta-");
			System.out.println("-1.Sí                              -");
			System.out.println("-2.No                              -");
			System.out.println("------------------------------------");
			op = sc.nextInt();
			
			switch (op) {
				case 1: {
					System.out.println("Escribe la cantidad deseada");
					saldo = sc.nextInt();
					listCuenta[i] = new Cuenta(titular, saldo); // Utilizo el constructor que tiene los parametros nombre y saldo
					break;
				}
				case 2:{
					listCuenta[i] = new Cuenta(titular); // Utilizo el contructor que ya esta inicializado con saldo(0)
					break;
				}
			}
		
	}
		
	
	}
	

		public static void retirarDinero(Cuenta listCuenta[]) {
			
			for (int i = 1; i < listCuenta.length; i++) {

				System.out.println("------------------------------------");
				System.out.println("-Desea retirar dinero de alguna cuenta-");
				System.out.println("-1.Sí                              -");
				System.out.println("-2.No                              -");
				System.out.println("------------------------------------");
				op = sc.nextInt();
				
				
			
			if(op == 1) {
				
				System.out.println("Lista de clientes registrados la sucursal bancaria");
				for (int i1 = 1; i1 < listCuenta.length; i1++) { // Imprimimos los nombres de los usuarios registrados con su correspondiente saldo
					System.out.println((i1)+"º cliente " + "[" + listCuenta[i1].getNombre()+"]" + "|| Saldo disponible: " + listCuenta[i1].getSaldo());
				}
			
				System.out.println("Marque la cuenta deseada");
				int nCuenta = sc.nextInt();
				System.out.println("Escribe la cantidad deseada, a retirar");
					saldoretirar = sc.nextInt();
					int dRetirado = (int) (listCuenta[nCuenta].getSaldo() - saldoretirar); // almacenamos la diferencia en una variable
					listCuenta[nCuenta].setSaldo(dRetirado); // pasamos la variable con el dato que queremos cambiar
					System.out.println("Su saldo ahora es: " + listCuenta[nCuenta].getSaldo() + "|| De la cuenta " + listCuenta[nCuenta].getNombre()); // imprimimos la cuenta actualizada con el nombre del cliente
					
			} else if(listCuenta[i].getSaldo()<0) { // si marca 2 por defecto acabara el prorama
				System.out.println("Sus operaciones han finalizado, vuelva cuando quiera");

					listCuenta[i].setSaldo = listCuenta[i].getSaldo() - saldoretirar;
		
				while(listCuenta[i].getSaldo()<0) {
					listCuenta[i].setSaldo = 0;
					System.out.println(listCuenta[i].getSaldo() + " " + listCuenta[i].getNombre());
				}
				
			System.out.println(listCuenta[i].getSaldo() + " " + listCuenta[i].getNombre());

			}
		}
		}
	
	
	
	
}