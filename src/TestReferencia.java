//Java asigna una referencia en la memoria a una variable
//La variable no tiene un valor específico, es sólo una referencia
//Es por eso que en el ejemplo siguiente si se ve afectado el valor 
//saldo de la instancia primeraCuenta cuando lo que buscabamos era
//modificar el valor saldo de segundaCuenta
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(33);
		primeraCuenta.depositar(200);;
		System.out.println("saldo primera cuenta "+primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(200);;
		
		System.out.println("saldo segunda cuenta " + segundaCuenta.getSaldo());
		System.out.println("saldo primera cuenta depues de modificar " + segundaCuenta.getSaldo());
		//Si se aumenta el 400 el valor del saldo de la segunda cuenta tambien cambia el de la primera por la misma razón.
		
		//Se puede imprimir la ubicacion en la memoria y verificar que tien el mismo valor 
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
	}
}
