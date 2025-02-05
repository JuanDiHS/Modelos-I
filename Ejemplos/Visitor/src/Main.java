
public class Main {

	public static void main(String[] args) {
		Tablet tableta = new Tablet("Samsung S9 FE");
		Computador computador = new Computador("Lenovo ThinkPad");
		Celular celular = new Celular("Iphone 16");
		
		DispositivoVisitor visitor = new DispositivoVisitor();
		visitor.visit(tableta);
		visitor.visit(computador);
		visitor.visit(celular);

	}

}
