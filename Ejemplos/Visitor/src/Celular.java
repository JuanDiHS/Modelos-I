//Elemento concreto
public class Celular implements Visitable{
	
	private String nombre;
	
	public Celular(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void JugarVideoJuegos() {
		System.out.println(getNombre() + " Ejecutando un videojuego");
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	
}
