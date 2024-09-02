package Modelos;

public class CasaConjuntoBuilder extends CasaBuilder {

	@Override
	public void buildPiso() {
		casa.setPiso("1");
		
	}

	@Override
	public void buildBaño() {
		casa.setBano("2");
		
	}

	@Override
	public void buildJardin() {
		casa.setJardin("1");
		
	}

	@Override
	public void buildGaraje() {
		casa.setGaraje("2");
		
	}

}
