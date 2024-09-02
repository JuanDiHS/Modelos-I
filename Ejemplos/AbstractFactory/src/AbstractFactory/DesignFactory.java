package AbstractFactory;

public class DesignFactory implements ServicioFactory{
	
	public ServicioInformatico crearServicio() {
		return new ServicioDesign();
	}

}
