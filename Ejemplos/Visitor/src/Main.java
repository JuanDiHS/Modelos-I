
public class Main {

	public static void main(String[] args) {
		Guerrero guerrero = new Guerrero("Guerrero");
		Mago mago = new Mago("Mago");
		Asesino asesino = new Asesino("Asesino");
		
		EnemyVisitor visitor = new EnemyVisitor();
		visitor.visit(guerrero);
		visitor.visit(mago);
		visitor.visit(asesino);

	}

}
