import java.util.*;

public class Main {
	
	// HE CREADO UN METODO DE INGRESAR Y HE PUESTO UN MENU
	// PROBANDO
		static Scanner sc = new Scanner(System.in);
		
		//METODO PRINCIPAL
		public static void main(String[] args) {
			
		int n = 0;
		int opcion;
		boolean continuar =true;
		String fin;
		do {
		System.out.println("Bienvenido al programa de gestión financiera");
		System.out.println("--------------------------------------------");
		System.out.println("Introduce el número de clientes");
		System.out.println("--------------------------------------------");
		n = sc.nextInt();
		System.out.println("--------------------------------------------");
		} while(n < 1);
		
		Cuenta listCuenta [] = new Cuenta[n];
		
		
		// CREAMOS LOS OBJETOS CUENTAS EN UN  ARRAY OBJETOS
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
				break;
			case 2:
			
				retirarDinero(listCuenta);
				break;	
		}
		
		System.out.println("Desea continuar con en el programa ¿SI o NO?:_");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continuar = true;
		}else if (fin.equalsIgnoreCase("no")){
			continuar = false;
			System.out.println("Adios");
			mejorMoney(listCuenta);
		}
			} while(continuar);
		
}
	
		
	public static void añadirCliente(Cuenta listCuenta[]) {
		double saldo; 
		 String titular;
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
					
		System.out.println(listCuenta[i].getNombre() + " Ingresa " + listCuenta[i].getSaldo() + " €");
		}
	}
	

		public static void retirarDinero(Cuenta listCuenta[]) {
				int saldoretirar; 
				// IMPRIME LOS NOMBRES DE LOS CLIENTES CON SU SALDO
				System.out.println("Lista de clientes registrados la sucursal bancaria");
				for (int i = 1; i < listCuenta.length; i++) { 
					System.out.println((i)+"º cliente " + "[" + listCuenta[i].getNombre()+"]" + "|| Saldo disponible: " + listCuenta[i].getSaldo());
					
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
			while (listCuenta[nCuenta].getSaldo()<0) { 
				System.out.println("Sus operaciones han finalizado, vuelva cuando quiera");

					listCuenta[nCuenta].setSaldo = listCuenta[nCuenta].getSaldo() - saldoretirar;
		
				while(listCuenta[nCuenta ].getSaldo()<0) {
					listCuenta[nCuenta ].setSaldo = 0;
					System.out.println(listCuenta[nCuenta].getSaldo() + " " + listCuenta[nCuenta ].getNombre());
				}
				
			System.out.println(listCuenta[nCuenta ].getSaldo() + " " + listCuenta[nCuenta].getNombre());
			}
		}
		
		public static void ingresarDinero(Cuenta listCuenta[]) {
				int saldoringresar;
				// IMPRIMIMOS LOS NOMBRES DE LOS CLIENTES REGISTRADOS CON SU CORRESPONDIENTE SALDO
				System.out.println("Lista de clientes registrados la sucursal bancaria");
				for (int i = 1; i < listCuenta.length; i++) { 
					System.out.println((i)+"º cliente " + "[" + listCuenta[i].getNombre()+"]" + "|| Saldo disponible: " + listCuenta[i].getSaldo());
					System.out.println(listCuenta[i].getNombre() + " Ingresa " + listCuenta[i].getSaldo() + " €");
				}
			
					System.out.println("Marque la cuenta deseada");
					int nCuenta = sc.nextInt();
					System.out.println("Escribe la cantidad deseada, a ingresar");
						saldoringresar = sc.nextInt();
						// ALMACENA LA SUMA EN UNA VARIABLE
						int dIngresado = (int) (listCuenta[nCuenta].getSaldo() + saldoringresar); 
						
						// PASA LA VARIABLE CON EL DATO QUE QUEREMOS CAMBIAR
						listCuenta[nCuenta ].setSaldo(dIngresado); 
						System.out.println("Su saldo ahora es: " + listCuenta[nCuenta].getSaldo() + "|| De la cuenta " + listCuenta[nCuenta].getNombre()); // imprimimos la cuenta actualizada con el nombre del cliente
					
					// SI MARCA 2 POR DEFECTO ACABARA EL PROGRAMA
			while (listCuenta[nCuenta].getSaldo()<0) { 
				System.out.println("Sus operaciones han finalizado, vuelva cuando quiera");

					listCuenta[nCuenta].setSaldo = listCuenta[nCuenta].getSaldo() + saldoringresar;
		
				while(listCuenta[nCuenta].getSaldo()<0) {
					listCuenta[nCuenta].setSaldo = 0;
					System.out.println(listCuenta[nCuenta].getSaldo() + " " + listCuenta[nCuenta].getNombre());
				}
				
			System.out.println(listCuenta[nCuenta].getSaldo() + " " + listCuenta[nCuenta].getNombre());
			
			
		}		
	}
		
		public static void mejorMoney(Cuenta listCuenta[]) {
			double maxMoney = 0;
			String nombre = "";
			for (int i = 1; i < listCuenta.length; i++) {
				if (listCuenta[i].getSaldo() > maxMoney) {
					maxMoney = listCuenta[i].getSaldo();
					nombre = listCuenta[i].getNombre();
				}
			}
					System.out.println("La cuenta con mas dinero es de " + nombre + " con una cantidad de " + maxMoney+" €");
		}
}