package Adapter;

public class ArepaQueso implements ComidaDeliciosa {
	
	String food = "Arepa de queso";
	String[] ingredients = {"Harina", "Mantequilla", "Queso"};
	

	@Override
	public String getArepaDeQueso() {
		
		return food;
	}

	@Override
	public String[] getArepaQuesoIngredientes() {
		
		return ingredients;
	}

}
