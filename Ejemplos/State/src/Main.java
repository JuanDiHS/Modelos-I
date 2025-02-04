import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		Amarillo amarillo = new Amarillo();
		Verde verde = new Verde();
		Rojo rojo = new Rojo();
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		do {
			muestramenu();
			opcion = leer.nextInt();
			switch(opcion){
			case 1:
				semaforo.setEstado(verde);
				break;
			case 2:
				semaforo.setEstado(amarillo);
				break;
			case 3:
				semaforo.setEstado(rojo);
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opción incorrecta");
			}
			semaforo.ejecutarAccion();
		}while(opcion != 0);
}
	private static void muestramenu() {
		System.out.println("Seleccione el estado del semaforo: ");
		System.out.println("1 - Verde\n 2 - Amarillo\n 3 - Rojo\n 0 - Salir.");
	}

}
