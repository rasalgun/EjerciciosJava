
public class Pregunta {
	private String enunciado;
	private String l1;
	private String l2;
	private String l3;
	private String l4;
	private String ltrue;
	private int valor;
	
	public Pregunta(String enunciado, String l1, String l2, String l3, String l4, String ltrue, int valor) {
		super();
		this.enunciado = enunciado;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.ltrue = ltrue;
		this.valor = valor;
		
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getL1() {
		return l1;
	}

	public void setL1(String l1) {
		this.l1 = l1;
	}

	public String getL2() {
		return l2;
	}

	public void setL2(String l2) {
		this.l2 = l2;
	}

	public String getL3() {
		return l3;
	}

	public void setL3(String l3) {
		this.l3 = l3;
	}

	public String getL4() {
		return l4;
	}

	public void setL4(String l4) {
		this.l4 = l4;
	}
	
	public String getltrue() {
		return ltrue;
	}
	
	public void setltrue(String ltrue) {
		this.ltrue = ltrue;
	}
	
	public int getvalor() {
		return valor;
	}
	
	public void setvalor(int valor) {
		this.valor = valor;
	}
	
	
	// Funciones y metodos de la clase pregunta
	
	public String toString() { // imprimir los datos deseados 
		return enunciado+"\n"+l1+"\n"+l2+"\n"+l3+"\n"+l4;
	}
}
