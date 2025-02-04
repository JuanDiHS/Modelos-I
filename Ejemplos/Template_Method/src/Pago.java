//Clase abstracta
public abstract class Pago {
	
	public abstract void procesarPago();
	public abstract void metodoPago();
	public abstract void validarPago();
	public abstract void resultado();
	
	public final void template() {
		procesarPago();
		metodoPago();
		validarPago();
		resultado();
	}
	

}
