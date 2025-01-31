
public class Guerrero implements Visitable{
	
	private String nombre;
	public Guerrero(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void Ataque() {
		System.out.println(getNombre() + " Ataque de guerrero");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
