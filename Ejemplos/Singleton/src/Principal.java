
public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(
					()->{
			MiClase.getInstance();
			}) {
			}.start();
		}

	}

}
