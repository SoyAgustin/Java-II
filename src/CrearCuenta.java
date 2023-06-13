
public class CrearCuenta {
 public static void main(String[] args) {
	 //Variable de tipo cuenta que representa a una cuenta nueva
	 //Se llama instancia a este tipo de variable.
	Cuenta primeraCuenta = new Cuenta();
	//Para modificar el valor saldo
	primeraCuenta.saldo = 1000;
	
	System.out.println(primeraCuenta.saldo);
	
	//new Cuenta(); crea en la memoria un espacio para una nueva instancia. y automaticamente se inicializan los valores por defecto dependiendo del tipo de variable.
	
	Cuenta segundaCuenta = new Cuenta();
	segundaCuenta.saldo = 500;
	System.out.println(segundaCuenta.saldo);
	
	System.out.println(primeraCuenta); // Son diferentes las direcciones de memoria de las dos cuentas
	System.out.println(segundaCuenta);
	
	
 }
}
