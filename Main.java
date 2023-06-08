
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pizza basePizza = new Pizza(true);
		//basePizza.addExtraToppings();
		//basePizza.addExtraCheese();
		//basePizza.takeaway();
		//basePizza.getBill();
		
		DeluxePizza dp = new DeluxePizza(false);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.getBill();
		
	}

}
