
public class Pizza {
	//instance variables
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeaway = false;
	
	//constructor
	public Pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}
		else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void getPizzaPrice() {
		System.out.println(this.price);
	}
	
	public void addExtraCheese() {
		isCheeseAdded = true;
		System.out.println("Extra Cheese added!");
		this.price += extraCheesePrice;
	
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		System.out.println("Extra Toppings added!");
		this.price += extraToppingsPrice;
	}
	
	public void takeaway() {
		isOptedForTakeaway = true;
		System.out.println("Take away opted");
		this.price += backPackPrice;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza: " + basePizzaPrice);
		
		if(isCheeseAdded) {
			bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
		}
		
		if(isExtraToppingsAdded) {
			bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
		}
		
		if(isOptedForTakeaway) {
			bill += "Takeaway: " + backPackPrice + "\n";
		}
		
		bill+= "Bill: " + this.price + "\n";
		System.out.println(bill);
	}
}
