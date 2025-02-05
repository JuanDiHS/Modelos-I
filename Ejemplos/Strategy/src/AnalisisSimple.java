//Estrategias concreta
public abstract class AnalisisSimple implements IEstrategia {
	public void analizar() {
		iniciar();
		cancelarPaquete();
		detener();
	}

	abstract void iniciar();

	abstract void cancelarPaquete();

	abstract void detener();

}
