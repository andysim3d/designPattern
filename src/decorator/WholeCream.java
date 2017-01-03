package decorator;

public class WholeCream extends Cream {

	
	public WholeCream(Meal m){
		this.set__m(m);
		this.set__price(1.25);
	}
	public double cost() {
		
		// TODO Auto-generated method stub
		return this.get__price() + this.get__m().cost();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "This is whole milk";
	}

}
