package Principal;

import Modelos.*;
public class Main {

	public static void main(String[] args) {
		Constructora constructora = new Constructora();
		CasaBuilder edificio_builder = new EdificioBuilder();
		CasaBuilder casaConjunto_builder = new CasaConjuntoBuilder();
		
		constructora.setcasaBuilder(casaConjunto_builder);
		constructora.construirCasa();
		
		Casa casa = constructora.getCasa();
		
		System.out.println(casa);
		

	}

}
