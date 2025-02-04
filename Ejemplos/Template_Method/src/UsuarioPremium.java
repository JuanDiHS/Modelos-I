//Clase concreta
public class UsuarioPremium extends Pago{

	public void procesarPago() {
		System.out.println("USUARIO PREMIUM\nSe está procesando el pago, tiempo estimado: 1 a 5 minutos");
		
	}

	public void metodoPago() {
		System.out.println("Método de pago: Efectivo, tarjeta debito, tarjeta crédito a cuotas");
		
	}

	public void validarPago() {
		System.out.println("Validando pago en efectivo, tarjeta debito o tarjeta crédito a cuotas");
		
	}

	public void resultado() {
		System.out.println("Su pago ha sido realizado con la exención de 4x1000 y con un descuento del 10%");
		
	}

}
