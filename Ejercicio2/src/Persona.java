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
}
