
class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//métodos: toda secuencia de pasos para realizar alguna accion
	
	//Los métodos que no retornan valor inician con void
	//Los métodos que retornan valor 
	
	//public al inicio del método tiene una funcionalidad que se verá después, para nosotros funciona bien sin "public"
	
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
}