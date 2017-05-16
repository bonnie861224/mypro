package oo.shopping;

public class GoldenCustomer extends Customer {
	int amount;
	public GoldenCustomer(int amount) {
		super(amount);
	}
	public void print(){
		System.out.println("折扣"+Math.round(amount*0.9)+"還原金"+Math.round(amount*0.05));
	}
}
