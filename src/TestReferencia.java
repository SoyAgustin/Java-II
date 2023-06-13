//Java asigna una referencia en la memoria a una variable
//La variable no tiene un valor específico, es sólo una referencia
//Es por eso que en el ejemplo siguiente si se ve afectado el valor 
//saldo de la instancia primeraCuenta cuando lo que buscabamos era
//modificar el valor saldo de segundaCuenta
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("saldo primera cuenta "+primeraCuenta.saldo);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("saldo segunda cuenta " + segundaCuenta.saldo);
		System.out.println("saldo primera cuenta depues de modificar " + segundaCuenta.saldo);
		//Si se aumenta el 400 el valor del saldo de la segunda cuenta tambien cambia el de la primera por la misma razón.
	}
}
