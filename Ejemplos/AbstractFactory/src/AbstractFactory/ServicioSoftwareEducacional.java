package AbstractFactory;

public class ServicioSoftwareEducacional implements ServicioInformatico{
	public void asignarTrabajo() {
		System.out.println("Nuestros programadores han sido informados del programa que deben realizar");
	}
	
	public void indicarFechaEntrega() {
		System.out.println("Se ha fijado como fecha de entrega el día 25/03/24");
	}
	
	public void informarSobrePago() {
		System.out.println("El monto a pagar será proporcional a la cantidad de estudiantes que harán uso ");
	}

}
