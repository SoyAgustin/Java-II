
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta(33);
		
		//cuentaDiego.titular.nombre = "Diego"; lanza un error Exception
		//esto pasa porque no está inicializado el objeto cliente (titular)
		
		/* La primera forma correcta de hacerlo es la siguiente
		 * 
		Cliente diego = new Cliente();
		cuentaDiego.titular = diego;
		cuentaDiego.titular.nombre = "Diego";
		System.out.println(cuentaDiego.titular.nombre);
		*/
		
		//La segunda forma es directamente crear cliente dentro del atributo titular de la clase cuentaDiego
		
		cuentaDiego.setTitular(new Cliente());
		
		System.out.println(cuentaDiego.getTitular().getNombre());
	}
}
