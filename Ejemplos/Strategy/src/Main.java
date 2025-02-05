
public class Main {

	public static void main(String[] args) {
		//Contexto contexto = new Contexto(new EntregaAvanzada());
		Contexto contexto = new Contexto(new EntregaSimple());
		contexto.ejecutar();

	}

}
