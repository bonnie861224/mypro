package oo.mid;

public class Meal {
	int price;
	Boolean where;// for here or to go
	int meal;

	public Meal(int price, Boolean where, int meal) {
		this.price = price;
		this.where = where;
		this.meal = meal;
	}

	public void bag() {
		if (where == true) {
			System.out.print("to go");
		} else {
			System.out.print("for here");
		}
	}

	public void order() {
    if(meal>6){
    	price=100;
    }else{
    	price=90;
    }
	}
}
