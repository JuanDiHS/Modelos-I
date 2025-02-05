//Objeto de estrategía
public class EntregaSimple extends AnalisisSimple{
	@Override
	void iniciar() {
		System.out.println("Entrega Simple - Análisis simple iniciado");
	}

	@Override
	void cancelarPaquete() {
		try {			
			System.out.println("Analizando...");
			Thread.sleep(2500);				
			System.out.println("No se pudo enviar el paquete de forma áerea");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}				
	}

	@Override
	void detener() {
		System.out.println("Entrega Simple - Análisis simple finalizado");		
	}

}
