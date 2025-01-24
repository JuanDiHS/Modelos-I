package Adapter;

//Implementación

public class Perfil implements Usuario{
	
	String perfil = "Perfil: ";
	String[] informacion = {"Membresia", "Duracion"};

	@Override
	public String getPerfil() {
		
		return perfil;
	}

	@Override
	public String[] getInformacion() {
		
		return informacion;
	}
	
	

}
