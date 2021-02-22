import java.util.*;

public class Main {
	
		static Scanner sc = new Scanner(System.in);
		static int n = 0, op;
		static double saldo, saldoretirar;
		static String titular;
		

		public static void main(String[] args) { // metodo principal
		
		System.out.println("Bienvenido al programa de gestión financiera");
		
		System.out.println("Introduce el número de clientes");
		n = sc.nextInt();
		
		Cuenta listCuenta [] = new Cuenta[n]; // Creamos los objetos cuentas en un array

	
		añadirCliente(listCuenta); // añadimos el nombre y el sueldo
		retirarDinero(listCuenta);
		
	}
	
	public static void añadirCliente(Cuenta listCuenta[]) {
		for (int i = 0; i < listCuenta.length; i++) {
			System.out.println("--------------------");
			System.out.println("-Añadir cliente " + (i+1)+ "º-");
			System.out.println("--------------------");
			System.out.println("Para darse de alta debe de indicar su nombre_");
		    titular = sc.next();
			System.out.println("------------------------------------");
			System.out.println("-Desea ingresar dinero en su cuenta-");
			System.out.println("-1.Sí                              -");
			System.out.println("-2.No                              -");
			System.out.println("------------------------------------");
			op = sc.nextInt();
			
			switch (op) { // Elige en
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
			
			for (int i = 0; i < listCuenta.length; i++) {
			System.out.println("Introduce Cliente para quien retirar dinero:_");
			titular = sc.next();
			System.out.println("------------------------------------");
			System.out.println("-Desea retirar dinero en su cuenta-");
			System.out.println("-1.Sí                              -");
			System.out.println("-2.No                              -");
			System.out.println("------------------------------------");
			op = sc.nextInt();
			
			if(op == 1) {
				System.out.println(listCuenta[i].getSaldo() + " " + listCuenta[i].getNombre());
				
					System.out.println("Escribe la cantidad deseada");
					saldoretirar = sc.nextInt();
			
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