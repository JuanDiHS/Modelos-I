package Adapter;

//Implementación 

public class PerfilAvanzado implements UsuarioPremium {
	
	String perfil = "Perfil avanzado: ";
	String[] informacion = {"Membresia", "Duracion", "Beneficios"};
	

	@Override
	public String getPerfilAvanzado() {
		
		return perfil;
	}

	@Override
	public String[] getPerfilAvanzadoInformacion() {
		
		return informacion;
	}

}
