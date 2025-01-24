//Cliente que utiliza la fachada


public class Cliente {

	public static void main(String[] args) {
		ManagerFlightFacade managerflights = new ManagerFlightFacade();
		managerflights.agendarVuelo("Juan Diego", "Bogotá", "Cali", "25/09/2024");

	}

}
