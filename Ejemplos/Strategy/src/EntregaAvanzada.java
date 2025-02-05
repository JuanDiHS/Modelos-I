//Objeto de estrategía
public class EntregaAvanzada extends AnalisisAvanzado {
	@Override
	void iniciar() {
		System.out.println("Entrega Avanzada - Análisis avanzado iniciado");
	}

	@Override
	void analizarPaquete() {		
		try {			
			System.out.println("Analizando paquete a enviar...");
			Thread.sleep(1000);						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarMensajería() {
		try {			
			System.out.println("Buscando la red de mensajería adecuada...");
			Thread.sleep(1000);							
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarMetodoEnvio() {
		try {			
			System.out.println("Analizando el método de envio más eficiente...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void notificarCliente() {
		try {			
			System.out.println("Entregando paquete al cliente...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Entrega Avanzada - Análisis avanzado finalizado");
	}

}
