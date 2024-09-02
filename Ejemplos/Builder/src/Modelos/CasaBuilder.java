package Modelos;

public abstract class CasaBuilder {
	protected Casa casa;
	
	public Casa getCasa() {
		return casa;
	}
	
	public void crearNuevaCasa() {
		casa = new Casa();
	}
	
	public abstract void buildPiso();
	public abstract void buildBaño();
	public abstract void buildJardin();
	public abstract void buildGaraje();

}
