
// Es la implementación de la clase abstracta Type y realiza el trabajo de bajo nivel

public class Burguer extends Type{
	
	private int cantidad, precio;
	private String tamano;
	
	protected Burguer(int cantidad, int precio, String tamano, DrawAPI drawAPI) {
		super(drawAPI);
		this.cantidad = cantidad;
		this.precio = precio;
		this.tamano = tamano;
	}
	
	public void make() {
		
		drawAPI.setBurguer(tamano, cantidad, precio);
	}

}
