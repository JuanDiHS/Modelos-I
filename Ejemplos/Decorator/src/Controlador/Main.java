package Controlador;
import Modelo.CarroEstandar;
import Inter_Imple.AutoElectrico;
import Interfaces.Automovil;

public class Main {

	public static void main(String[] args) {
		
		Automovil carro = new AutoElectrico(new CarroEstandar("Aveo"));
		carro.encender();
		carro.acelerar();
		carro.frenar();

	}

}
