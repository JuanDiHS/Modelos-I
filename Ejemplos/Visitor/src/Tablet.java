//Elemento concreto
public class Tablet implements Visitable{
	
	private String nombre;
	public Tablet(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void Ataque() {
		System.out.println(getNombre() + " Escribiendo apuntes universitarios");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
