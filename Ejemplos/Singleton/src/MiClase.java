
public class MiClase {
	
	private static MiClase instance = null;
	static int numeroInstancias = 0;
	
	
	String campo1 = "Valor1";
	String campo2 = "Valor2";
	
	private MiClase() {
		
	}
	
	public static MiClase getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (MiClase.class) {
				if (instance == null) {
					instance = new MiClase();
					numeroInstancias++;
					System.out.println("Número de instancias: " + numeroInstancias);
				}
			}
			
		}
		return instance;
	}

}
