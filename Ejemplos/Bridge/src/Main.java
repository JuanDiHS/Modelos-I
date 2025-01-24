
//COntrolador

public class Main {

	public static void main(String[] args) {
		Type chickenBurguer = new Burguer(10, 10000, "Grande", new ChickenBurguer());
		Type beefBurguer = new Burguer(5, 8000, "Mediana", new BeefBurguer());
		
		chickenBurguer.make();
		beefBurguer.make();
		

	}

}
