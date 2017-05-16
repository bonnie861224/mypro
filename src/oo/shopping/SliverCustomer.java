package oo.shopping;

public class SliverCustomer extends Customer {
	int amount;
	public SliverCustomer(int amount) {
		super(amount);
	}
	public void print(){
		System.out.println("折扣"+Math.round(amount*0.9));
	}
}
