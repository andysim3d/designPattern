package decorator;

public class MochaCoffee extends Coffee {

	public MochaCoffee(Meal m) {
		this.set__m(m);
		this.set__price(2);
		// TODO Auto-generated constructor stub
	}
	/**
	 * coffee as base
	 */
	public double cost() {
		// TODO Auto-generated method stub
		return this.get__price();
	}

}
