package Adapter;

//Clase encargada de crear los perfiles usando los métodos de la clase Usuario

public class PerfilFactory {
	
	void crearPerfil(Usuario perfil) {
		System.out.println("Obteniendo informacion");
		System.out.println("Creando perfil");
		for(int i = 0; i<perfil.getInformacion().length; i++) {
			System.out.println(perfil.getInformacion()[i] + " ");
		}
		
		System.out.println("\n" + perfil.getPerfil() + " Creado");
		System.out.println("---------------------------");
	}

}
