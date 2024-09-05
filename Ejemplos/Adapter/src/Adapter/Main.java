package Adapter;

public class Main {

	public static void main(String[] args) {
		Arepa arepa = new Arepa();
		ArepaQueso arepaqueso = new ArepaQueso();
		
		ArepaFactory arepafactory = new ArepaFactory();
		arepafactory.prepararArepa(arepa);
		
		ArepaQuesoToFood arepaAdapter = new ArepaQuesoToFood(arepaqueso);
		arepafactory.prepararArepa(arepaAdapter);

	}

}
