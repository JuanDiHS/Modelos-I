
// Clase abstracta que será usada por la implementación

public abstract class Type {
	
	
	
	protected DrawAPI drawAPI;
	
	protected Type(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
		
	}
	
	public abstract void make();

}
