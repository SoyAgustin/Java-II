
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(33);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("1236412");
		cliente.setTelefono("5519350789");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(titular.getNombre());//Estas 3 lineas estan referenciando al mismo objeto
	}
}
