package AbstractFactory;

public class ServicioDesign implements ServicioInformatico{
	public void asignarTrabajo() {
		System.out.println("El trabajado ha sido asignado a diseñadores gráficos disponibles");
	}
	
	public void indicarFechaEntrega() {
		System.out.println("Ellos han determinado terminar el trabajo como máximo para el día 17/07/2024");
	}
	
	public void informarSobrePago() {
		System.out.println("Debe realizar el pago en efectivo al momento de recoger el logo completamente");
	}

}
