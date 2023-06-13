
class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//métodos: toda secuencia de pasos para realizar alguna accion
	
	//Los métodos que no retornan valor inician con void
	//Los métodos que retornan valor 
	
	//public al inicio del método tiene una funcionalidad que se verá después, para nosotros funciona bien sin "public"
	public void depositar(double valor){
		saldo += valor;
	}
}