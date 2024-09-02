// Concrete builder
package Modelos;

public class EdificioBuilder extends CasaBuilder {

	@Override
	public void buildPiso() {
		casa.setPiso("10");
		
	}

	@Override
	public void buildBaño() {
	   casa.setBano("1");
	}

	@Override
	public void buildJardin() {
		casa.setJardin("0");
		
	}

	@Override
	public void buildGaraje() {
		casa.setGaraje("1");
		
	}
	

}
