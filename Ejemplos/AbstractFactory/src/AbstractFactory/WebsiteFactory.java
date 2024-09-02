package AbstractFactory;

public class WebsiteFactory implements ServicioFactory{
	
	public ServicioInformatico crearServicio() {
		return new ServicioWebsites();
	}

}
