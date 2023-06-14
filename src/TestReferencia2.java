
public class TestReferencia2 {
	public static void main(String[] args) {
		//Creamos un cliente con la clase cliente 
		//junto con sus datos
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("45444332");
		diego.setTelefono("999922562");
		
		//Creamos una cuenta
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.setAgencia(1);;
		cuentaDiego.setTitular(diego);; // Aquí es donde se hace la referencia al cliente llamado diego
		//Están "vinculadas" a través de la referencia.
		
		
		System.out.println(cuentaDiego.getTitular().getDocumento());
		System.out.println(cuentaDiego.getTitular()); //Esto es solo la dirección de memoria en donde se encuentra el objeto diego
		System.out.println(diego);//la línea anterior es la misma que esta
		
	}
}
