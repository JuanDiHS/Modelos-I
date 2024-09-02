// Clase director
package Modelos;

public class Constructora {
	private CasaBuilder casaBuilder;
	
	public void setcasaBuilder(CasaBuilder CB) {
		casaBuilder = CB;
	}
	
	public Casa getCasa() {
		return casaBuilder.getCasa();
	}
	
	public void construirCasa() {
		casaBuilder.crearNuevaCasa();
		casaBuilder.buildPiso();
		casaBuilder.buildBaño();
		casaBuilder.buildJardin();
		casaBuilder.buildGaraje();
	}

}
