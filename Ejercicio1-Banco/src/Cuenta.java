
public class Cuenta {
	
	 public double setSaldo;
	String titular;
	 double saldo;
	
	public Cuenta(String titular, double saldo) {
			super();
			this.titular = titular;
			this.saldo = saldo;
		}
	
	public Cuenta(String titular) { // método constructor para cuentas que no tengan saldo
		super();
		this.titular = titular;
		this.saldo = 0;
	}
	
	// metodos get y setters
	
	

	public String getNombre() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [setSaldo=" + setSaldo + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//Eventos y funciones que puede tener la cuenta como retirar e ingresar el dinero
	//Metodo ingresar dinero
	//Metodo retirar dinero
	
	
}
