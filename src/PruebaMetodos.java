
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(300);;
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		cuentaDeJimena.transferir(400, miCuenta);
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
