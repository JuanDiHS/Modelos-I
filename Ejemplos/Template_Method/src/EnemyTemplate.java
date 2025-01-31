
public abstract class EnemyTemplate {
	
	public abstract void habilidades();
	public abstract void ataque();
	public abstract void proteger();
	public abstract void resultado();
	
	public final void template() {
		habilidades();
		ataque();
		proteger();
		resultado();
	}
	

}
