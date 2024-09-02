package Main;

import Modelo.CuentaJugador;

public class Principal {

	public static void main(String[] args) {
		
		CuentaJugador cuenta1 = new CuentaJugador();
		cuenta1.setNivel("10");
		CuentaJugador cuentaClon = (CuentaJugador) cuenta1.clonar();
		
		if (cuentaClon != null) {
			System.out.println(cuentaClon);
			System.out.println(cuenta1);
		}
		
		System.out.println(cuentaClon == cuenta1);

	}

}
