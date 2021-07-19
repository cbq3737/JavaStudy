package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee coffee_a = new EtiopiaAmericano();
		Coffee coffee_k = new kenyaAmericano();
		
		Latte latte_a = new Latte(coffee_a);
		Latte latte_k = new Latte(coffee_k);
		
//		latte_a.brewing();
//		latte_k.brewing();
		
		Mocha mocha_a = new Mocha(new Latte(new EtiopiaAmericano()));
		Mocha mocha_k = new Mocha(new Latte(new kenyaAmericano()));
		
//		mocha_a.brewing();
//		mocha_k.brewing();
		
		WhippingCream cream_a = new WhippingCream(new Mocha(new Latte(new EtiopiaAmericano())));
		WhippingCream cream_k = new WhippingCream(new Mocha(new Latte(new kenyaAmericano())));
	
		cream_a.brewing();
		cream_k.brewing();
	}
}
