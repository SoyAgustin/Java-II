
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(400);
		cuenta.retirar(300);
		cuenta.setAgencia(22);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
