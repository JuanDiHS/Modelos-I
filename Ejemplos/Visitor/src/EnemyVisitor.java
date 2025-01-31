
public class EnemyVisitor implements Visitor{

	@Override
	public void visit(Guerrero guerrero) {
		System.out.println("Visitando al guerrero");
		guerrero.Ataque();
		
	}

	@Override
	public void visit(Mago mago) {
		System.out.println("Visitando al mago");
		mago.AtaqueElemental();
	}

	@Override
	public void visit(Asesino asesino) {
		System.out.println("Visitando al asesino");
		asesino.AtaqueSilencioso();
	}

}
