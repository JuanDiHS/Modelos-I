package Adapter;

//Clase Adaptadora

public class PAvanzadoToUsuario implements Usuario{
	
	public static PerfilAvanzado perfilavanzado;
	
	PAvanzadoToUsuario(PerfilAvanzado pa){
		perfilavanzado = pa;
	}

	@Override
	public String getPerfil() {
		
		return perfilavanzado.getPerfilAvanzado();
	}

	@Override
	public String[] getInformacion() {
		
		return perfilavanzado.getPerfilAvanzadoInformacion();
	}
	

}
