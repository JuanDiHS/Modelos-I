
// Implementación concreta

public class ChickenBurguer implements DrawAPI{
	
	@Override
	public void setBurguer(String tamano, int cantidad, int precio) {
		
		System.out.println("Preparando la hamburguesa: [Tipo]: Pollo, cantidad " + cantidad +
				", precio: " + precio + ", Tamaño: " + tamano + "]");
		
	}

}
