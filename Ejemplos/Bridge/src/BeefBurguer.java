
// Implementación concreta

public class BeefBurguer implements DrawAPI{
	
	

	@Override
	public void setBurguer(String tamano, int cantidad, int precio) {
		
		System.out.println("Preparando la hamburguesa: [Tipo]: Carne, cantidad " + cantidad +
				", precio: " + precio + ", Tamaño: " + tamano + "]");
		
	}

}
