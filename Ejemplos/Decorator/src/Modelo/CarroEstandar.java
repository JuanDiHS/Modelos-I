package Modelo;

import Interfaces.Automovil;

//Esta clase es un componente concreto

public class CarroEstandar implements Automovil{
	
	private String nombre;
	
	public CarroEstandar(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void acelerar() {
		System.out.println("Aceleración estandar");
	}

	@Override
	public void frenar() {
		System.out.println("Frenar");		
	}

	@Override
	public void encender() {
		System.out.println("Prendiendo el carro");
		
	}
	
	

}
