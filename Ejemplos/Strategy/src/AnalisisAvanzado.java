//Estrategias concreta
public abstract class AnalisisAvanzado implements IEstrategia{
	
	public void analizar() {
		iniciar();
		analizarPaquete();
		analizarMensajería();
		analizarMetodoEnvio();
		notificarCliente();
		detener();
	}

	abstract void iniciar();

	abstract void analizarPaquete();

	abstract void analizarMensajería();
	
	abstract void analizarMetodoEnvio();
	
	abstract void notificarCliente();	

	abstract void detener();

}
