package decorator;

public class NonfatCream extends Cream {

	//to be decorated
	//
	public NonfatCream(Meal m){
		this.set__m(m);
		this.set__price(0.5);
	}
	public double cost() {
		
		// TODO Auto-generated method stub
		return this.get__price() + this.get__m().cost();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "This is nonfat milk";
	}

}
