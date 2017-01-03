package decorator;

public abstract class Coffee implements Meal {

	private Meal __m;
	private double __price;
	public Meal get__m() {
		return __m;
	}
	public void set__m(Meal __m) {
		this.__m = __m;
	}
	public double get__price() {
		return __price;
	}
	public void set__price(double __price) {
		this.__price = __price;
	}
}
