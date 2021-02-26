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
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getProfesion() {
		return profesion;
	}



	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
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

	public String comprobarSexo(char sexo) {
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

