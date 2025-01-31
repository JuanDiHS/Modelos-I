
public class Asesino implements Visitable{
	private String nombre;
	public Asesino(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void AtaqueSilencioso() {
		System.out.println(getNombre() + " Ataque sigiloso");
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	
}
