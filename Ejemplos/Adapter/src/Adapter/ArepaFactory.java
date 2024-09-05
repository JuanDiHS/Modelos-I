package Adapter;

public class ArepaFactory {
	
	void prepararArepa(Food food) {
		System.out.println("Iniciando preparación");
		System.out.println("Mezclando");
		for(int i = 0; i<food.getIngredients().length; i++) {
			System.out.println(food.getIngredients()[i] + " ");
		}
		
		System.out.println("\n" + food.getFood() + " Preparado");
		System.out.println("---------------------------");
	}

}
