package Modelo;

import Interface.InterCuenta;

public class CuentaJugador implements InterCuenta{
	
	private String personaje;
	private String nivel;
	
	public CuentaJugador() {
		personaje = "Mago";
	}

	@Override
	public InterCuenta clonar() {
		CuentaJugador cuenta = null;
		
		try {
			cuenta = (CuentaJugador) clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta de jugador [personaje = " + personaje + ", nivel = " + nivel + "]";
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	

}
