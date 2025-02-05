//Elemento concreto
public class Computador implements Visitable{
	
	private String nombre;
	
	public Computador(String nombre) {
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public void ejecutandoMultitarea() {
		System.out.println(getNombre() + " ejecutando programas en segundo plano");
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	
}
