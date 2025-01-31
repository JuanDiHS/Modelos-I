
public class Mago implements Visitable{
	
	private String nombre;
	public Mago(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void AtaqueElemental() {
		System.out.println(getNombre() + " Ataque elemental de mago");
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	
}
