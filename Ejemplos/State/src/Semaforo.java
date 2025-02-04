//Clase contexto
public class Semaforo {
	private Estado miEstado;
	
	public void setEstado(Estado e) {
		this.miEstado = e;
	}
	
	public void ejecutarAccion() {
		miEstado.EjecutarAccion();
	}

}
