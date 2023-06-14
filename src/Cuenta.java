
class Cuenta {
	private double saldo; //con private no se puede modificar directamente fuera de la clase (este archivo) a esto se le llama encapsulamiento.
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(); //es un tipo cliente, ya contiene los atributos de un cliente
	
	//métodos: toda secuencia de pasos para realizar alguna accion
	
	//Los métodos que no retornan valor inician con void
	//Los métodos que retornan valor 
	
	//public al inicio del método tiene una funcionalidad que se verá después, para nosotros funciona bien sin "public"
	
	//El codigo siguiente es un constructor, se pueden inicializar atributos desde que se crean en el código fuera de aqui
	
	
	private static int total=0; //no pertenece a la instancia, sino a la clse
	public Cuenta(int agencia) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}
		this.agencia = agencia;
		total++;
		System.out.println("Cuentas totales = "+total);
	}
	
	public void depositar(double saldo){
		this.saldo =  this.saldo + saldo;
		
		//this sirve para hacer referencia al atributo y diferenciarlo del parámetro del método.
	}
	
	public boolean retirar(double valor) {
		if (this.saldo>=valor) {
			this.saldo = this.saldo-valor;
			return true; //Es el resultado de la operación, pero no lo imprime, a menos que lo indiquemos, se puede trabajar con este valor haciendo referencia con una nueva variable.
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo>= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() { //verbo onbtener en ingles por convención
		return this.saldo;
	}
	
	public void setAgencia(int agencia){
		if (agencia>=0) {
			this.agencia= agencia;
		}else {
			System.out.println("No están permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public static int getTotal() {
		return total;
	}
	
}