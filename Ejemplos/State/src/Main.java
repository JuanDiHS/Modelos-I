import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Alarma alarma = new Alarma();
		Activa activa = new Activa();
		Mantenimiento mantenimiento = new Mantenimiento();
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		do {
			muestramenu();
			opcion = leer.nextInt();
			switch(opcion){
			case 1:
				alarma.setEstado(activa);
				break;
			case 2:
				alarma.setEstado(mantenimiento);
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opción incorrecta");
			}
			alarma.ejecutarAccion();
		}while(opcion != 0);
}
	private static void muestramenu() {
		System.out.println("Seleccione el estado de la alarma: ");
		System.out.println("1 - Activa\n 2 - Mantenimiento\n 0 - Salir.");
	}

}
