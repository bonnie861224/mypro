package oo.shopping;

public class SliverCustomer extends Customer {
	public double amount;
	public SliverCustomer(int amount) {
		super(amount);
	}
	public void print(){
		System.out.println("折扣"+Math.round(amount*0.9));
	}
}
