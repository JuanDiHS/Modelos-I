package AbstractFactory;

public class SoftwareFactory implements ServicioFactory{
	
	public ServicioInformatico crearServicio() {
		return new ServicioSoftwareEducacional();
	}

}
