//Clase concreta
public class UsuarioPro extends Pago{

	public void procesarPago() {
		System.out.println("USUARIOPRO\nSe está procesando el pago, tiempo estimado: 5 a 10 minutos");
		
	}

	public void metodoPago() {
		System.out.println("Método de pago: Efectivo o tarjeta debito");
		
	}

	public void validarPago() {
		System.out.println("Validando pago en efectivo o tarjeta debito");
		
	}

	public void resultado() {
		System.out.println("Su pago ha sido realizado con la exención de 4x1000");
		
	}

}
