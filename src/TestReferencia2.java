
public class TestReferencia2 {
	public static void main(String[] args) {
		//Creamos un cliente con la clase cliente 
		//junto con sus datos
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "45444332";
		diego.telefono = "999922562";
		
		//Creamos una cuenta
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.agencia = 1;
		cuentaDiego.titular = diego; // Aquí es donde se hace la referencia al cliente llamado diego
		//Están "vinculadas" a través de la referencia.
		
		
		System.out.println(cuentaDiego.titular.documento);
		System.out.println(cuentaDiego.titular); //Esto es solo la dirección de memoria en donde se encuentra el objeto diego
		System.out.println(diego);//la línea anterior es la misma que esta
		
	}
}
