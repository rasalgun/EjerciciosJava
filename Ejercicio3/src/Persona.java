
import java.util.*;

public class Persona {

	String nombre, dni, profesion;
	int edad, peso, altura;
	char sexo;
	double salario;
	
	public Persona(String nombre, int edad, String dni, char sexo, String profesion, double salario, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.profesion = profesion;
		this.salario = salario;
		this.peso = peso;
		this.altura = altura;
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
		String error;
		if(sexo=='H' || sexo=='M') {
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
	
	
	public String toString() {
		return "nombre:" +nombre+ "-" + " edad:" +edad+ "-" + " dni:" +dni+ "-" + " sexo:" +sexo+ "-" + " profesion:" + profesion + "-" + " salario:" + salario + "-" + " peso:" + peso + "-" + " altura:" + altura;
}
}

