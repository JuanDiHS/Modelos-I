package Adapter;

public class Arepa implements Food{
	
	String food = "Arepa";
	String[] ingredients = {"Harina", "Mantequilla"};

	@Override
	public String getFood() {
		
		return food;
	}

	@Override
	public String[] getIngredients() {
		
		return ingredients;
	}
	
	

}
