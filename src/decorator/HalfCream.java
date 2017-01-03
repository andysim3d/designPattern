package decorator;

public class HalfCream extends Cream {

	//
	public HalfCream(Meal m){
		this.set__m(m);
		this.set__price(1.0);
	}
	public double cost() {
		
		// TODO Auto-generated method stub
		return this.get__price() + this.get__m().cost();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "This is half & half milk";
	}


}
