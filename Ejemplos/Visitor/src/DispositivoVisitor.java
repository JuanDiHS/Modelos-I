// Visitante concreto
public class DispositivoVisitor implements Visitor{

	@Override
	public void visit(Tablet tableta) {
		System.out.println("Analizando la tableta");
		tableta.Ataque();
		
	}

	@Override
	public void visit(Computador computador) {
		System.out.println("Analizando el computador");
		computador.ejecutandoMultitarea();
	}

	@Override
	public void visit(Celular celular) {
		System.out.println("Analizando el celular");
		celular.JugarVideoJuegos();
	}

}
