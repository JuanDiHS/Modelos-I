package Decorador;

import Interfaces.Automovil;

public abstract class AutomovilDecorador implements Automovil {
	
	private Automovil auto;
	
	public AutomovilDecorador(Automovil auto) {
		this.auto = auto;
		
	}
	
	protected Automovil getAuto() {
		return auto;
	}

}
