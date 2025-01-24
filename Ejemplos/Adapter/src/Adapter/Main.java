package Adapter;

//Controlador

public class Main {

	public static void main(String[] args) {
		Perfil perfil = new Perfil();
		PerfilAvanzado perfilavanzado = new PerfilAvanzado();
		
		PerfilFactory perfilfactory = new PerfilFactory();
		perfilfactory.crearPerfil(perfil);
		
		PAvanzadoToUsuario perfiladapter = new PAvanzadoToUsuario(perfilavanzado);
		perfilfactory.crearPerfil(perfiladapter);

	}

}
