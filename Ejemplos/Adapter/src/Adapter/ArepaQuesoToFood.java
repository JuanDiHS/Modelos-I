package Adapter;

public class ArepaQuesoToFood implements Food{
	
	public static ArepaQueso arepaQueso;
	
	ArepaQuesoToFood(ArepaQueso aq){
		arepaQueso = aq;
	}

	@Override
	public String getFood() {
		
		return arepaQueso.getArepaDeQueso();
		}

	@Override
	public String[] getIngredients() {
		
		return arepaQueso.getArepaQuesoIngredientes();
	}
	

}
