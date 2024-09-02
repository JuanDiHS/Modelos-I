// CLASE PRODUCTO
package Modelos;

public class Casa {
	private String piso = "";
	private String bano = "";
	private String jardin = "";
	private String garaje = "";
	
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public void setBano(String bano) {
		this.bano = bano;
	}
	public void setJardin(String jardin) {
		this.jardin = jardin;
	}
	public void setGaraje(String garaje) {
		this.garaje = garaje;
	}
	@Override
	public String toString() {
		return "Casa [piso = " + piso + ", baño = " + bano + ", jardin = " + jardin
				+ ", garaje = " + garaje + "]";
	}
	
}
