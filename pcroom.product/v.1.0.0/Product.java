package pcroom.product;

import java.util.HashMap;



public class Product {
	
	private int price;
	private String pname;
	
	
	public HashMap<String, Food> addFood = new HashMap<String, Food>();
	public HashMap<String, Drink> addDrink = new HashMap<String, Drink>();
	public HashMap<String, ChargedTime> addChargedTime = new HashMap<String, ChargedTime>();
	
	
	
	
	Product(int price, String pname){
		this.price = price;
		this.pname = pname;
	}
	
	
	
	@Override
	public String toString() {
		return "[가격 : " + price + ", 이름 : " + pname + "]";
	}
	
	

}
