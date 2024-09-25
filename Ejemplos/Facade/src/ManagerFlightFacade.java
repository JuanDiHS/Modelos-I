
public class ManagerFlightFacade {
	
	private ReservacionVuelo reservacionVuelo;
	private VuelosDisponibles vuelosDisponibles;
	private DarTicket darTicket;
	
	public ManagerFlightFacade() {
		reservacionVuelo = new ReservacionVuelo();
		vuelosDisponibles = new VuelosDisponibles();
		darTicket = new DarTicket();
	}
	
	public void agendarVuelo(String pasajero, String origen, String destino, String fecha) {
		if (vuelosDisponibles.verificarDisponibilidad(origen, destino, fecha)) {
			reservacionVuelo.bookflight(origen, destino, fecha);
			darTicket.darTicket(pasajero, origen, destino, fecha);
	
		}else {
			System.out.println("Lo siento, no hay disponibilidad para el vuelo seleccionado.");
		}
	}

}
