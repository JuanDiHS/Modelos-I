package Inter_Imple;

import Decorador.AutomovilDecorador;
import Interfaces.Automovil;

public class AutoElectrico extends AutomovilDecorador {

	public AutoElectrico(Automovil auto) {
		super(auto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Iniciando Electricamente");
		getAuto().acelerar();
}

	@Override
	public void frenar() {
		System.out.println("Controlando frenos electronicos");
		getAuto().frenar();
		
	}

	@Override
	public void encender() {
		System.out.println("Iniciando sistema operativo");
		getAuto().encender();
		
		
	}

}
