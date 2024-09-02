package AbstractFactory;

public class ServicioWebsites implements ServicioInformatico{
	
	public void asignarTrabajo() {
		System.out.println("El personal encargado del desarrollo de sitios web ha aceptado el trabajo");
	}
	
	public void indicarFechaEntrega() {
		System.out.println("El sitio web con Responsive Design será terminado a más tardar el día 26/04/24");
	}
	
	public void informarSobrePago() {
		System.out.println("El monto a pagar no incluye el pago por dominio y hosting");
	}

}
