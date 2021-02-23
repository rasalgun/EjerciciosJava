import java.util.*;

public class Main {
	
	// HE CREADO UN METODO DE INGRESAR Y HE PUESTO UN MENU
	
		static Scanner sc = new Scanner(System.in);
		static int n = 0, op;
		static double saldo, saldoretirar, saldoringresar;
		static String titular;
		static int opcion, opcionsalir;
		static boolean continuar =true;
		static String fin;
		
		//METODO PRINCIPAL
		public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa de gestión financiera");
		System.out.println("--------------------------------------------");
		System.out.println("Introduce el número de clientes");
		System.out.println("--------------------------------------------");
		n = sc.nextInt();
		System.out.println("--------------------------------------------");
		
		Cuenta listCuenta [] = new Cuenta[n+1];
		
		
		// CREAMOS LOS OBJETOS CUENTAS EN UN  ARRAY
		// MENU 
	
		
		System.out.println("Menu del programa de gestión financiera");
		System.out.println("Añadir clientes");
		añadirCliente(listCuenta);
		do {
			do {
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("Elige una opcion:_ \n 1.- Ingresar mas dinero. \n 2.- Retirar dinero.");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		opcion = sc.nextInt();
		}while(opcion < 1 || opcion > 2 );
		
		switch(opcion) {
	
			case 1:
				
				ingresarDinero(listCuenta);
				System.out.println("Desea continuar con en el programa ¿SI o NO?:_");
				fin = sc.next();
				if(fin.equalsIgnoreCase("si")) {
					continuar = true;
				}else {
					continuar = false;
					System.out.println("Adios");
				}
				break;
			case 2:
			
				retirarDinero(listCuenta);
				System.out.println("Desea continuar con en el programa ¿SI o NO?:_");
				fin = sc.next();
				if(fin.equalsIgnoreCase("si")) {
					continuar = true;
				}else {
					continuar = false;
					System.out.println("Adios");
				}
				break;	
		}
			} while(continuar = true);
}
	
		
	public static void añadirCliente(Cuenta listCuenta[]) {
		for (int i = 1; i < listCuenta.length; i++) {
			System.out.println("--------------------");
			System.out.println("-Añadir cliente " + (i)+ "º-");
			System.out.println("--------------------");
			System.out.println("Para darse de alta debe de indicar su nombre_");
		    titular = sc.next();
	
					// SE UTILIZA EL CONSTRUCTOR QUE TIENE LOS PARAMETROS NOMBRE Y SALDO
					System.out.println("Escribe la cantidad dinero a ingresar");
					saldo = sc.nextInt();
					listCuenta[i] = new Cuenta(titular, saldo); 
					
					
					
		
			}
		
	
	}
	

		public static void retirarDinero(Cuenta listCuenta[]) {
			
			for (int i = 1; i < listCuenta.length; i++) {
				
				// IMPRIME LOS NOMBRES DE LOS CLIENTES CON SU SALDO
				System.out.println("Lista de clientes registrados la sucursal bancaria");
				for (int i1 = 1; i1 < listCuenta.length; i1++) { 
					System.out.println((i1)+"º cliente " + "[" + listCuenta[i1].getNombre()+"]" + "|| Saldo disponible: " + listCuenta[i1].getSaldo());
				}
			
				System.out.println("Marque la cuenta deseada");
				int nCuenta = sc.nextInt();
				System.out.println("Escribe la cantidad deseada, a retirar");
					saldoretirar = sc.nextInt();
					
					// ALMACENA LA DIFERENCIA EN UNA VARIABLE
					int dRetirado = (int) (listCuenta[nCuenta].getSaldo() - saldoretirar); 
					
					// PASA LA VARIABLE CON EL DATO QUE QUEREMOS CAMBIAR
					listCuenta[nCuenta].setSaldo(dRetirado); 
					System.out.println("Su saldo ahora es: " + listCuenta[nCuenta].getSaldo() + "|| De la cuenta " + listCuenta[nCuenta].getNombre()); // imprimimos la cuenta actualizada con el nombre del cliente
					
					
					// SI MARCA 2 POR DEFECTO ACABARA EL PROGRAMA
			while (listCuenta[i].getSaldo()<0) { 
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
	
		public static void ingresarDinero(Cuenta listCuenta[]) {
			
			for (int i = 1; i < listCuenta.length; i++) {

			
				// IMPRIMIMOS LOS NOMBRES DE LOS CLIENTES REGISTRADOS CON SU CORRESPONDIENTE SALDO
				System.out.println("Lista de clientes registrados la sucursal bancaria");
				for (int i1 = 1; i1 < listCuenta.length; i1++) { 
					System.out.println((i1)+"º cliente " + "[" + listCuenta[i1].getNombre()+"]" + "|| Saldo disponible: " + listCuenta[i1].getSaldo());
				}
			
				System.out.println("Marque la cuenta deseada");
				int nCuenta = sc.nextInt();
				System.out.println("Escribe la cantidad deseada, a ingresar");
					saldoringresar = sc.nextInt();
					// ALMACENA LA SUMA EN UNA VARIABLE
					int dIngresado = (int) (listCuenta[nCuenta].getSaldo() + saldoringresar); 
					
					// PASA LA VARIABLE CON EL DATO QUE QUEREMOS CAMBIAR
					listCuenta[nCuenta].setSaldo(dIngresado); 
					System.out.println("Su saldo ahora es: " + listCuenta[nCuenta].getSaldo() + "|| De la cuenta " + listCuenta[nCuenta].getNombre()); // imprimimos la cuenta actualizada con el nombre del cliente
					
					// SI MARCA 2 POR DEFECTO ACABARA EL PROGRAMA
			while (listCuenta[i].getSaldo()<0) { 
				System.out.println("Sus operaciones han finalizado, vuelva cuando quiera");

					listCuenta[i].setSaldo = listCuenta[i].getSaldo() + saldoringresar;
		
				while(listCuenta[i].getSaldo()<0) {
					listCuenta[i].setSaldo = 0;
					System.out.println(listCuenta[i].getSaldo() + " " + listCuenta[i].getNombre());
				}
				
			System.out.println(listCuenta[i].getSaldo() + " " + listCuenta[i].getNombre());

			}
		}
		}
	
	
	
}